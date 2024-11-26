import java.util.*;

public class MaxConnectedComponents {
	static class DSU {
    private int[] parent;
    private int[] rank;
		private int[] size;

    public DSU(int n) {
        parent = new int[n];
        rank = new int[n];
				size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
						size[i] = 1;
        }
    }

    public int find(int x) {
			if (parent[x] != x) {
					parent[x] = find(parent[x]);
			}
			return parent[x];
    }

    public void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX != rootY) {
					if (rank[rootX] < rank[rootY]) {
							parent[rootX] = rootY;
							size[rootY] += size[rootX];
					} else if (rank[rootX] > rank[rootY]) {
							parent[rootY] = rootX;
							size[rootX] += size[rootY];
					} else {
							parent[rootY] = rootX;
							rank[rootX]++;
							size[rootX] += size[rootY];
					}
			}
    }
		public int size(int x) {
			return size[find(x)];
		}

		public void remove(int x) {
			int root = find(x);
			size[root]--;
			parent[x] = x;
		}
	}

	public static int solve(int n,int m,String[] grids) {
		DSU dsu = new DSU(n * m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grids[i].charAt(j) == '#') {
					if (i + 1 < n && grids[i+1].charAt(j) == '#') {
						dsu.union(i * m + j, (i+1) * m + j);
					}
					if (j + 1 < m && grids[i].charAt(j+1) == '#') {
						dsu.union(i * m + j, i * m + j + 1);
					}
				}
			}
		}

		int ans = 0;

		int[] vis = new int[n * m];
		for (int i = 0; i < n * m; i++) {
			vis[i] = -1;
		}
		// 行
		for (int r = 0; r < n; r++) {
			int size = 0;
			for (int i = 0; i < m; i++) {
				if (grids[r].charAt(i) == '.') {
					size++;
				}
				for (int x = Math.max(0, r - 1); x <= Math.min(n - 1, r + 1); x++) {
					if (grids[x].charAt(i) == '#') {
						int u = dsu.find(x * m + i);
						if (vis[u] != r) {
							vis[u] = r;
							size += dsu.size(u);
						}
					}
				}
			}
			ans = Math.max(ans, size);
		}

		for (int i = 0; i < n * m; i++) {
			vis[i] = -1;
		}

		// 列
		for (int c = 0; c < m; c++) {
			int size = 0;
			for (int i = 0; i < n; i++) {
				if (grids[i].charAt(c) == '.') {
					size++;
				}
				for (int y = Math.max(0, c - 1); y <= Math.min(m-1, c + 1); y++) {
					if (grids[i].charAt(y) == '#') {
						int u = dsu.find(i * m + y);
						if (vis[u] != c) {
							vis[u] = c;
							size += dsu.size(u);
						}
					}
				}
			}

			ans = Math.max(ans, size);
		}
return ans;
	}

}
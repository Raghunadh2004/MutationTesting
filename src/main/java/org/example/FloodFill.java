package org.example;
import java.util.*;
import java.awt.Point;

public class FloodFill {
    static boolean isValid(int[][] screen, int m, int n, int x, int y, int prevC, int newC)
    {
        if(x < 0 || x >= m || y < 0 || y >= n || screen[x][y] != prevC
                || screen[x][y]== newC)
            return false;
        return true;
    }

    public static int [][] Solution(int[][] screen, int m, int n, int x, int y, int prevC, int newC)
    {
        Vector<Point> queue = new Vector<Point>();

        queue.add(new Point(x, y));

        screen[x][y] = newC;

        while(queue.size() > 0)
        {
            // Dequeue the front node
            Point currPixel = queue.get(queue.size() - 1);
            queue.remove(queue.size() - 1);

            int posX = currPixel.x;
            int posY = currPixel.y;

            if(isValid(screen, m, n, posX + 1, posY, prevC, newC))
            {
                screen[posX + 1][posY] = newC;
                queue.add(new Point(posX + 1, posY));
            }

            if(isValid(screen, m, n, posX-1, posY, prevC, newC))
            {
                screen[posX-1][posY]= newC;
                queue.add(new Point(posX-1, posY));
            }

            if(isValid(screen, m, n, posX, posY + 1, prevC, newC))
            {
                screen[posX][posY + 1]= newC;
                queue.add(new Point(posX, posY + 1));
            }

            if(isValid(screen, m, n, posX, posY-1, prevC, newC))
            {
                screen[posX][posY-1]= newC;
                queue.add(new Point(posX, posY-1));
            }
        }
        return screen;
    }
}


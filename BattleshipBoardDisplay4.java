import java.util.*;
class Battleship {
    String teamName;
    int sectorX;
    int sectorY;

    Battleship(String teamName, int sectorX, int sectorY) {
        this.teamName = teamName;
        // Convert 1-based coordinates to 0-based
        this.sectorX = sectorX - 1;
        this.sectorY = sectorY - 1;
    }
}

public class BattleshipBoardDisplay4 {
    public static void main(String[] args) {
        
        List<Battleship> ships = Arrays.asList(
            new Battleship("A", 3, 5),
            new Battleship("Z", 7, 1),
            new Battleship("Z", 4, 4),
            new Battleship("A", 2, 6)
        );

        
        int maxX = 0;
        int maxY = 0;
        for (Battleship ship : ships) {
            if (ship.sectorX > maxX) {
                maxX = ship.sectorX;
            }
            if (ship.sectorY > maxY) {
                maxY = ship.sectorY;
            }
        }

        
        String[][] board = new String[maxY + 1][maxX + 1];
        for (int i = 0; i <= maxY; i++) {
            Arrays.fill(board[i], ".");
        }

        
        for (Battleship ship : ships) {
            board[ship.sectorY][ship.sectorX] = ship.teamName;
        }

        // Check for adjacent "A" and "Z" ships
        for (Battleship ship : ships) {
            int x = ship.sectorX;
            int y = ship.sectorY;

            
            checkAndConvert(board, ship.teamName, x, y, x - 1, y); // left
            checkAndConvert(board, ship.teamName, x, y, x + 1, y); // right
            checkAndConvert(board, ship.teamName, x, y, x, y - 1); // up
            checkAndConvert(board, ship.teamName, x, y, x, y + 1); // down
            checkAndConvert(board, ship.teamName, x, y, x - 1, y - 1); // top-left
            checkAndConvert(board, ship.teamName, x, y, x + 1, y - 1); // top-right
            checkAndConvert(board, ship.teamName, x, y, x - 1, y + 1); // bottom-left
            checkAndConvert(board, ship.teamName, x, y, x + 1, y + 1); // bottom-right
        }

        // Print the board with X and Y coordinates
        System.out.print("  "); // Space for alignment
        for (int j = 1; j <= maxX + 1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = maxY; i >= 0; i--) {
            System.out.print((i + 1) + " "); // Print Y-axis label (1-based)
            for (int j = 0; j <= maxX; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method to check and convert if the adjacent position has an opposing team ship
    private static void checkAndConvert(String[][] board, String teamName, int x, int y, int adjX, int adjY) {
        if (adjX >= 0 && adjX < board[0].length && adjY >= 0 && adjY < board.length) {
            if (isAdjacentToOpposingTeam(board, teamName, adjY, adjX)) {
                board[y][x] = teamName.toLowerCase();
                board[adjY][adjX] = board[adjY][adjX].toLowerCase();
            }
        }
    }

    // method to check if the adjacent position has an opposing team ship
    private static boolean isAdjacentToOpposingTeam(String[][] board, String teamName, int y, int x) {
        return (board[y][x].equals("A") && teamName.equals("Z")) || (board[y][x].equals("Z") && teamName.equals("A"));
    }
}
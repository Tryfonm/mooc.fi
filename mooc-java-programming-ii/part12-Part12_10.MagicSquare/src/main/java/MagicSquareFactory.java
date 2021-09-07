
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int currentX = 0;
        int currentY = (int) size / 2;

        
        square.placeValue(currentX, currentY, 1);
        int currentValue = 2;
        int maxIter = size * size;
        while (true) {

            if (currentX - 1 >= 0 && currentY + 1 < square.getWidth()) {
                // System.out.println("echo 1");
                int tempX = currentX;
                int tempY = currentY;
                currentX -= 1;
                currentY += 1;
                if (square.readValue(currentX, currentY) != 0) {
                    // System.out.println("cell taken");
                    if (currentX <= square.getHeight()) {
                        currentX = tempX + 1;
                        currentY = tempY;
                    } else {
                        currentX = 0;
                        currentY = tempY;
                    }
                }

            } else if (currentX - 1 >= 0 && currentY + 1 >= square.getWidth()) {
                // System.out.println("echo 2");
                int tempX = currentX;
                int tempY = currentY;
                currentX -= 1;
                currentY = 0;
                if (square.readValue(currentX, currentY) != 0) {
                    // System.out.println("cell taken");
                    if (currentX <= square.getHeight()) {
                        currentX = tempX + 1;
                        currentY = tempY;
                    } else {
                        currentX = 0;
                        currentY = tempY;
                    }
                }
            } else if (currentX - 1 < 0 && currentY + 1 < square.getWidth()) {
                // System.out.println("echo 3");
                int tempX = currentX;
                int tempY = currentY;
                currentX = square.getHeight() - 1;
                currentY += 1;
                if (square.readValue(currentX, currentY) != 0) {
                    // System.out.println("cell taken");
                    if (currentX <= square.getHeight()) {
                        currentX = tempX + 1;
                        currentY = tempY;
                    } else {
                        currentX = 0;
                        currentY = tempY;
                    }
                }
            } else if (currentX - 1 < 0 && currentY + 1 >= square.getWidth()) {
                // System.out.println("echo 4");
                int tempX = currentX;
                int tempY = currentY;
                currentX = square.getHeight() - 1;
                currentY = 0;
                if (square.readValue(currentX, currentY) != 0) {
                    //System.out.println("cell taken");
                    if (currentX <= square.getHeight()) {
                        currentX = tempX + 1;
                        currentY = tempY;
                    } else {
                        currentX = 0;
                        currentY = tempY;
                    }
                }
            }
            square.placeValue(currentX, currentY, currentValue);
            currentValue++;

            if (currentValue > maxIter) {
                break;
            }
        }
        return square;
    }
}

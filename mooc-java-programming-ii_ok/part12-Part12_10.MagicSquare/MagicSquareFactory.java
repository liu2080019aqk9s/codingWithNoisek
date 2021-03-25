
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
        int row = 0;
        int col = size / 2;
        int number = 1;
        
        // implement the creation of a magic square with the Siamese method algorithm here
        while (number <= size * size) {
            if (square.readValue(col, row) != 0) {
                row = (row + 2) % size;
                col = (col + size - 1) % size;
            } else{
                square.placeValue(col, row, number);
                number ++;
                row = (row + size - 1) % size;
                col = (col + 1) % size;
            }
        }
        
        return square;
    }

}

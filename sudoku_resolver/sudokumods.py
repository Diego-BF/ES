from cell import Cell


def generate_sudoku():
    """ read the values provided and generate a matrix of the sudoku """
    sudoku = [[Cell() for i in range(9)] for j in range(9)]
    for i in range(9):
        raw_read = input()
        read_values = raw_read.split(" ")

        j = 0
        for item in read_values:
            sudoku[i][j].value = item
            j += 1
            # sudoku[i][j].value = "0"

    return sudoku


def show_sudoku(sudoku):
    """ print the values in sudoku's cells in a formatted way """
    for i in range(9):
        for j in range(9):
            print(sudoku[i][j].value, end="")
            if j == 2 or j == 5:
                print(" | ", end="")
            elif j < 8:
                print(" ", end="")

        if i == 2 or i == 5:
            print("\n- - - - - - - - - - -")
        elif i <= 8:
            print()


def is_value_in_col_row(sudoku, col, row, value):
    """ return true if the value is in the row or column that pass in the
    cell
    """
    value_found = False

    # search in the row
    for i in range(9):
        if sudoku[i][col].value is value and i is not row:
            value_found = True
            print("linha alterou")
            break

    if not value_found:
        # search in the column
        for j in range(9):
            if sudoku[row][j].value is value and j is not col:
                value_found = True
                print("coluna alterou")
                break

    return value_found


def is_value_in_sector(sudoku, corner_col, corner_row, value):
    """ return True if the value is in the sector where the cell is, False
    otherwise
    """

    value_found = False
    for i in range(3):
        for j in range(3):
            if sudoku[corner_row+i][corner_col+j].value is value:
                value_found = True
                break

    return value_found


def search_value_in_sector(sudoku, col, row, value):
    """ function that call the is_value_in_sector with the appropriate corner
    cell and return True if the value is found
    """
    corner_col = 0
    corner_row = 0

    # set the cordinates of the corner cell of the sector
    if col >= 3 and col < 6:
        corner_col = 3
    elif col >= 6:
        corner_col = 6

    if row >= 3 and row < 6:
        corner_row = 3
    elif row >= 6:
        corner_row = 6

    # call the is_value_in_sector function with the correct cordinates
    return is_value_in_sector(sudoku, corner_col, corner_row, value)

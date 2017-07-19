from cell import Cell


def generate_sudoku():
    """ Read the values provided and generate a matrix of the sudoku """
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
    """ Print the values in sudoku's cells in a formatted way """
    for i in range(9):
        for j in range(9):
            print(sudoku[i][j].value, end="")
            #print(sudoku[i][j].possibilities, end="")
            # print(len(sudoku[i][j].possibilities), end="")
            if j == 2 or j == 5:
                print(" | ", end="")
            elif j < 8:
                print(" ", end="")

        if i == 2 or i == 5:
            print("\n- - - - - - - - - - -")
        elif i <= 8:
            print()


def is_value_in_row_col(sudoku, row, col, value):
    """ Return true if the value is in the row or column that pass in the
    cell
    """
    value_found = False

    # search in the row
    for i in range(9):
        if sudoku[i][col].value is value:
            value_found = True
            break

    if not value_found:
        # search in the column
        for j in range(9):
            if sudoku[row][j].value is value:
                value_found = True
                break

    return value_found


def is_value_in_sector(sudoku, corner_row, corner_col, value):
    """ Return True if the value is in the sector where the cell is, False
    otherwise
    """

    value_found = False
    for i in range(3):
        for j in range(3):
            if sudoku[corner_row+i][corner_col+j].value is value:
                value_found = True
                break

    return value_found


def search_value_in_sector(sudoku, row, col, value):
    """ Function that call the is_value_in_sector with the appropriate corner
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
    return is_value_in_sector(sudoku, corner_row, corner_col, value)


def analyze_sudoku(sudoku):
    """ Function that analyze each cell in sudoku searching for the possible
    values of they
    """
    sudoku_finished = False
    
    while not sudoku_finished:
        sudoku_finished = True
        for i in range(9):
            for j in range(9):
                if sudoku[i][j].value is "X":
                    sudoku_finished = False
                    if len(sudoku[i][j].possibilities) == 1:
                        sudoku[i][j].value = sudoku[i][j].possibilities.pop()
                    else:
                        for value in sudoku[i][j].possibilities:
                            value_found = False
                            value_found = is_value_in_row_col(sudoku, i, j, value)

                            # Test the sector only if the value wasn't found in col/row
                            if not value_found:
                                value_found = search_value_in_sector(
                                        sudoku, i, j, value)

                            # If the value isn't possible, remove from the
                            # possibilities of the cell
                            if value_found:
                                sudoku[i][j].possibilities.remove(value)
                else:
                    sudoku[i][j].possibilities = []
    
class Cell:
    """ class for the cells in the sudoku grid """
    def __init__(self):
        self.value = "X"
        self.possibilities = [9]

        for i in self.possibilities:
            i = True

    def change_possibility(self, pos):
        # function to set a possibility of a number to false
        self.possibilities[pos - 1] = False

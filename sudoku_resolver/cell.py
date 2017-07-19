class Cell:
    """ class for the cells in the sudoku grid """
    def __init__(self):
        self.value = "X"
        self.possibilities = ["1", "2", "3", "4", "5", "6", "7", "8", "9"]

    def change_possibility(self, poss):
        # function to set a possibility of a number to false
        self.possibilities.remove(poss)

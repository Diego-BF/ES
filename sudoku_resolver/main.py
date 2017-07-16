import sudokumods as sumod


sudoku = sumod.generate_sudoku()
sumod.show_sudoku(sudoku)

entrada = input("coluna, linha e valor: ")
col, row, value = entrada.split(" ")
print(sumod.search_value_in_sector(sudoku, int(col), int(row), value))

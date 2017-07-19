import sudokumods as sumod


sudoku = sumod.generate_sudoku()
sumod.analyze_sudoku(sudoku)
sumod.show_sudoku(sudoku)
# #entrada = input("linha, coluna e valor: ")
# #row, col, value = entrada.split(" ")
# lista = ['1', '2', '3', '4', '5', '6', '7', '8', '9']
# for j in lista:
#     j = str(j)
#     print(sumod.is_value_in_row_col(sudoku, 0, 2, j))

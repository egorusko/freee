package Сhapter1_to_5.Class;
/*
** Класс для отображения значений в двоичном виде
* Тип	Размер (бит)	Диапазон
byte	8   бит	от -128 до 127
short	16  бит	от -32768 до 32767
char	16  бит	без знаковое целое число, представляющее собой символ UTF-16 (буквы и цифры)
int	    32  бит	от -2147483648 до 2147483647
long	64  бит	от -9223372036854775808 до 9223372036854775807
*/

public class ShowBits {
    int numbit;

    public ShowBits(int numbit) {
        this.numbit = numbit;
    }

    public void show(long val) {
        long mask = 1;
        mask <<= numbit - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;

            if ((spacer & 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}




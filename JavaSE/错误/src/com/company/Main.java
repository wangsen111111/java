package com.company;
/*
    分析代码
1.代码写的比较臃肿，因为还有事做，就先不简化了，有时间再做简化和图形化界面。
2.问题，很多东西可以写在方法外面的，一开始没想清楚就开写，导致最后不想改了。
3.我认为三目运算符很好用，再处理黑白棋时，如char temp2 = (times) ? ‘X’ : ‘O’;不管是打印时，还是在比较时，用它可以将黑棋白棋认为是一种棋。
4.用boolean 类型的，每次取反，可以表现两种相反的状态。
5.在计算多子同线问题时，要善用for循环（开始时的条件；循环成立的条件；每次循环的变化）
           如何判断的多子共线
            我们接收到下棋者输入的,xy坐标，放入坐标系中本来是要考虑8个方向，我们先考虑四个方向，当然还要考虑数组越界的情况，这四个方向都是xy坐标通过加0，加1，加-1可以到达的方向
	         for (xx = a[0] + DX[k], yy = a[1] + DY[k]; xx >= 0 && yy >= 0 && xx < qi.length && yy < qi.length
					&& qi[xx][yy] == temp; xx += DX[k], yy += DY[k]) {
				c1++;
			}

}

 */
import java.util.Scanner;
public class Main {
    static boolean erro_xy = true;
    private static Scanner input;

    public static void main(String[] args) {
        int n = nPrint();
        play(n);
    }
    //输入函数
    private static int nPrint() {
        input = new Scanner(System.in);
        System.out.print("请输入想玩几子棋：");
        int n = input.nextInt();
        return n;
    }
    //游戏函数
    private static void play(int n) {
        char[][] _chessBoard = new char[(n - 2) * n][(n - 2) * n];
        CheckerBoard(n, _chessBoard);
    }

    private static void CheckerBoard(int n, char[][] qi) { // 棋盘
        // 第一次打印棋盘 ，没有棋子
        for (int i = 0; i < qi.length; i++) {
            for (int j = 0; j < qi.length; j++) {
                System.out.print("-----");
            }
            System.out.println();
            for (int j = 0; j < qi.length; j++) {
                System.out.print("|");
                System.out.print(" " + qi[i][j] + " ");
            }
            System.out.println("|");
        }
        for (int j = 0; j < qi.length; j++) {
            System.out.print("-----");
        }
        System.out.println();
        boolean times = true;//设置计数 看是白棋还是黑棋
        while (true) {//多次循环 每次为游戏者输入
            char[][] newQi;
            newQi = chessBoard(chessPlayer((n - 2) * n, times), qi, n, times);// 获得新棋谱
            if (newQi == null)//如果为null 那么结束游戏
                break;
            if (!erro_xy) {// 下棋处已经存在棋子，报错
                times = !times;
                erro_xy = true;
            }
            times = !times;//换棋子
            qi = newQi;// 转换身份
        }
    }

    private static int judgeToWin(int[] a, char[][] qi, int n, boolean times) {//判断玩家是否已经取胜或为和棋
        char temp = (times) ? 'X' : 'O';
        int DX[] = { 1, 0, 1, 1 };
        int DY[] = { 0, 1, 1, -1 };
        int c1, c2, xx, yy;
        for (int k = 0; k < 4; k++) {
            c1 = c2 = 0;
            for (xx = a[0] + DX[k], yy = a[1] + DY[k]; xx >= 0 && yy >= 0 && xx < qi.length && yy < qi.length
                    && qi[xx][yy] == temp; xx += DX[k], yy += DY[k]) {
                c1++;
            }
            for (xx = a[0] - DX[k], yy = a[1] - DY[k]; xx >= 0 && yy >= 0 && xx < qi.length && yy < qi.length
                    && qi[xx][yy] == temp; xx -= DX[k], yy -= DY[k]) {
                c2++;
            }
            if (c1 + c2 >= n - 1)
                return (times) ? 1 : 2;
        }
        return heqi(qi);
    }

    private static char[][] chessBoard(int[] a, char[][] newQi, int n, boolean times) {//将下棋人下的棋存入棋谱，并画新棋谱
        if (newQi[a[0]][a[1]] == '\u0000')
            newQi[a[0]][a[1]] = (times) ? 'X' : 'O';
        else {
            System.out.println("已经有棋子了,请重新输入");
            erro_xy = false;
        }
        for (int i = 0; i < newQi.length; i++) {
            for (int j = 0; j < newQi.length; j++) {
                System.out.print("----");
            }
            System.out.println();
            for (int j = 0; j < newQi.length; j++) {
                System.out.print("|");
                System.out.print(" " + newQi[i][j] + " ");
            }
            System.out.println("|");
        }
        for (int j = 0; j < newQi.length; j++) {
            System.out.print("----");
        }
        System.out.println();
        int key = judgeToWin(a, newQi, n, times);
        if (key == 1) {
            System.out.println("A棋手赢了");
            return null;
        } else if (key == 2) {
            System.out.println("B棋手赢了");
            return null;
        } else if (key == 3) {
            System.out.println("和棋");
            return null;
        } else {
            System.out.println();
        }
        return newQi;
    }

    private static int heqi(char[][] qi) {//和棋判断
        int sum = 0;
        for (int i = 0; i < qi.length; i++) {
            for (int j = 0; j < qi[i].length; j++) {
                if (qi[i][j] == '\u0000')
                    sum++;
            }
        }
        if (sum == 0)
            return 3;
        else
            return 0;
    }

    private static int[] chessPlayer(int n, boolean times) {//下棋者 输入函数
        input = new Scanner(System.in);
        int[] a = new int[2];
        char temp = (times) ? 'A' : 'B';
        char temp2 = (times) ? 'X' : 'O';
        System.out.print("请棋手" + temp + "（" + temp2 + "）先下棋：x轴范围1-" + n + " :");
        a[0] = input.nextInt() - 1;
        System.out.print("请棋手" + temp + "（" + temp2 + "）先下棋：y轴范围1-" + n + " :");
        a[1] = input.nextInt() - 1;
        return a;
    }
}

package program;

import java.util.ArrayList;
import java.util.Scanner;

public interface ISignUp {
    // 打印输出结果
    public void print();
    // 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent (int stuType);

    // 解析命令行输入的参数（格式），如文档描述
    public static IParams parse() throws Exception{
        Scanner scan = new Scanner(System.in);
        String[] a = SchoolSystem.parse(scan.next());
            IParams iparams = new IParams() {
                int Big;
                int Medium;
                int Small;

                @Override
                public int getBig() {
                    IParams();
                    return Big;
                }

                @Override
                public int getMedium() {
                    IParams();
                    return Medium;
                }

                @Override
                public int getSmall() {
                    IParams();
                    return Small;
                }

                @Override
                public ArrayList<Integer> getPlanSignUp() {
                     ArrayList<Integer> planSignUp = new ArrayList<Integer>();
                     for (int i = 4;i<a.length;i++) {
                         planSignUp.add(Integer.valueOf(a[i]));
                     }
                    return planSignUp;
                }
                void IParams() {
                    for (int i = 1; i < 4; i++) {
                        if (i == 1) {
                            Big = (Integer.valueOf(a[i]));
                        } else if (i == 2) {
                            Medium = (Integer.valueOf(a[i]));
                        } else {
                            Small = (Integer.valueOf(a[i]));
                        }
                    }
                }
        };return iparams;
    }
}


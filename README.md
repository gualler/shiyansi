# shiyansi
要做什么：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，
怎么做：每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
       允许提供输入参数，统计古诗中某个字或词出现的次数
       考虑操作中可能出现的异常，在程序中设计异常处理程序
       
核心d代码：package Pack;
import java.util.Scanner;
public class mode {
 public static void main(String[] args) {
  try {
   String txt ="汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识"+ "天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色"+ "春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时"+ "云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝";
   StringBuffer s = new StringBuffer(txt);
   for (int i = 7; i < s.length(); i = i + 15) {
    s.insert(i, ",");
    }
   for (int i = 15; i < s.length() + 1; i = i + 16) {
    s.insert(i, "。");
   }
   for (int i = 16; i < s.length(); i = i + 17) {
    s.insert(i, "\n");
   }
   System.out.println(s);
   Scanner in = new Scanner(System.in);// 定义scanner，从键盘输入
   System.out.println("\n 键盘输入要查找的文字:");
   String poem = in.nextLine();
   String a = s.toString();·
   int indexStart = 0;
   int count = 0;
   while (true) {
    int tm = a.indexOf(poem, indexStart);
    if (tm >= 0) {
     count++;
     indexStart = tm + poem.length();
     } else {
      break;
      }
    }
   if (count == 0) {
    System.out.println("文本中没有这个字或词");
    } else {
     System.out.println("这个字或词共出现了" + count + "次");
     }
   } catch (Exception e) {
    System.err.println("存在异常" + e.toString());
    }
  }
 }


感想：掌握字符串中string及其使用方法，还掌握异常处理程序

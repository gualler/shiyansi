package Pack;
import java.util.Scanner;
public class mode {
 public static void main(String[] args) {
  try {
   String txt ="������ɫ˼�����������󲻵������Ů���������������δʶ"+ "��������������һ��ѡ�ھ��������һЦ������������������ɫ"+ "������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ"+ "���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯";
   StringBuffer s = new StringBuffer(txt);
   for (int i = 7; i < s.length(); i = i + 15) {
    s.insert(i, ",");
    }
   for (int i = 15; i < s.length() + 1; i = i + 16) {
    s.insert(i, "��");
   }
   for (int i = 16; i < s.length(); i = i + 17) {
    s.insert(i, "\n");
   }
   System.out.println(s);
   Scanner in = new Scanner(System.in);// ����scanner���Ӽ�������
   System.out.println("\n ��������Ҫ���ҵ�����:");
   String poem = in.nextLine();
   String a = s.toString();��
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
    System.out.println("�ı���û������ֻ��");
    } else {
     System.out.println("����ֻ�ʹ�������" + count + "��");
     }
   } catch (Exception e) {
    System.err.println("�����쳣" + e.toString());
    }
  }
 }

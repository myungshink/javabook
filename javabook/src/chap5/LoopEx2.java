package chap5;

public class LoopEx2 {
	public static void main(String[] args) {
		int sum=0, i=1;
		System.out.println("for������ �̿��� �� ���ϱ�");
		for(i=1;i<=100;i++) {
			sum += i; //�ݺ������� 1���� ��� {} ���� ����
		}
		System.out.println("for�� �̿��� �հ�:" + sum);
		System.out.println("while������ �̿��� �� ���ϱ�");
		sum=0;
		i=1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("while�� �̿��� �հ�:" + sum);
		System.out.println("do while������ �̿��� �� ���ϱ�");
		sum=0;
		i=1;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("dowhile�� �̿��� �հ�:"+sum);

	}

}



public class BreakStatement2 {

	public static void main(String[] args) {
	
		
		outer:for( int month = 1 ; month <= 12 ; month++ ) {
			
			switch (month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					System.out.println(month + "月有31天");
					break outer ; // 退出 for 循环而不仅仅是 跳出 switch
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println(month + "月有30天");
					break;
				case 2:
					System.out.println(month + "月有28天或29天");
					break;
			}
			
		}

	}

}

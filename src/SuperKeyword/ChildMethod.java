package SuperKeyword;

public class ChildMethod extends ParentMethod {

	
		public void getStatement() {
			super.getStatement();
			System.out.println("This Is A Child Method");
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ChildMethod cm=new ChildMethod();
				cm.getStatement();

	}

}

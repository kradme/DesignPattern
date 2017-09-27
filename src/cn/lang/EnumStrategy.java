package cn.lang;
/**
 * 枚举策略模式
 * @author Lang
 *
 */
public enum EnumStrategy {
	//加法
	ADD("+"){

		@Override
		public int execu(int a, int b) {
			return a+b;
		}
	},
	SUB("-") {
		@Override
		public int execu(int a, int b) {
			return a-b;
		}
	};
	String value;
	//构造方法
	private EnumStrategy(String value){
		this.value = value;
	}
	//声明抽象方法，枚举中必须实现
	public abstract int execu(int a, int b);

	
	public static void main(String[] args) {
		int a = 123;
		int b = 456;
		int resultAdd = EnumStrategy.ADD.execu(a, b);
		System.out.println(resultAdd);
		int resultSub = EnumStrategy.SUB.execu(a, b);
		System.out.println(resultSub);
	}
}

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
		public int execu(int a, int...b) {
			for(int i=0;i<b.length;i++){
				a = a+b[i];
			}
			return a;
		}
	},
	SUB("-") {
		@Override
		public int execu(int a, int...b) {
			for(int i=0;i<b.length;i++){
				a = a-b[i];
			}
			return a;
		}
	};
	String value;
	//构造方法
	private EnumStrategy(String value){
		this.value = value;
	}
	//声明抽象方法，枚举中必须实现
	public abstract int execu(int a, int...b);

	
	public static void main(String[] args) {
		int resultAdd = EnumStrategy.ADD.execu(1);
		System.out.println(resultAdd);
		int resultSub = EnumStrategy.SUB.execu(1);
		System.out.println(resultSub);
	}
}

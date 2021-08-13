package B_com.after.implementing.singleton.example;
/**
*
* @author Samarth Narula
*/

// nested static class --> Bill Pugh Singleton Implementation : Thread Safe and Lazy Loaded
public class E_InnerStaticClassSingleton {

	private E_InnerStaticClassSingleton(){}
	
	private static class SigletonCreator{
		private static final E_InnerStaticClassSingleton instance = new E_InnerStaticClassSingleton();
	}
	
	public static E_InnerStaticClassSingleton getInstance() {
		return SigletonCreator.instance;
	}
	
}

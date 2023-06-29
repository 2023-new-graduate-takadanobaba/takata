package Lesson1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lesson1Test {

	@Test
	public void ボタンを押す() {
		//	準備

		//	実行
		boolean button;
		VendingMachine sut = new VendingMachine();
		button = sut.pushedButton();

		//	検証
		assertEquals(true, button);
	}

	@Test
	public void ボタンを押さない() {
		//	準備

		//	実行
		boolean button;
		VendingMachine sut = new VendingMachine();
		button = sut.waitedButton();

		//	検証
		assertEquals(false, button);
	}

	@Test
	public void コーラ表示() {
		//	準備

		//	実行
		String drink;
		VendingMachine sut = new VendingMachine();
		drink = sut.select();

		//	検証
		assertEquals("コーラ", drink);
	}

	@Test
	public void 百円投入() {
		//	準備

		//	実行
		int coin;
		VendingMachine sut = new VendingMachine();
		sut.insert();
		coin = sut.getCoin();

		//	検証
		assertEquals(100, coin);
	}

	@Test
	public void 百円以外投入() {
		//	準備

		//	実行
		int coin;
		VendingMachine sut = new VendingMachine();
		coin = sut.getCoin();

		//	検証
		assertEquals(0, coin);
	}
//
//	@Test
//	public void コーラが出る() {
//		//	準備
//
//		//	実行
//		String selectDrink;
//		VendingMachine sut = new VendingMachine();
//		selectDrink = sut.dispense1();
//			
//		//	検証
//		assertEquals("コーラ", selectDrink);
//	}

}

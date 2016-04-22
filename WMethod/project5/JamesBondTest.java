package project5;

import static org.junit.Assert.*;

import org.junit.Test;

public class JamesBondTest {
	
	
	JamesBond bond = new JamesBond();
	boolean b;
	
	@Test
	public void testCase0() { 
		b = bond.bondRegex("(()");
		assertFalse(b);
	}
	@Test
	public void testCase1() { 
		b = bond.bondRegex("((007)");
		assertTrue(b);
	}
	@Test
	public void testCase2() { 
		b = bond.bondRegex("((07)");
		assertFalse(b);
	}
	@Test
	public void testCase3() { 
		b = bond.bondRegex("((7)");
		assertFalse(b);
	}
	@Test
	public void testCase4() { 
		b = bond.bondRegex("()");
		assertFalse(b);
	}
	@Test
	public void testCase5() { 
		b = bond.bondRegex("())");
		assertFalse(b);
	}
	@Test
	public void testCase6() { 
		b = bond.bondRegex("()007)");
		assertTrue(b);
	}
	@Test
	public void testCase7() { 
		b = bond.bondRegex("()07)");
		assertFalse(b);
	}
	@Test
	public void testCase8() { 
		b = bond.bondRegex("()7)");
		assertFalse(b);
	}
	@Test
	public void testCase9() { 
		b = bond.bondRegex("(0()");
		assertFalse(b);
	}
	@Test
	public void testCase10() { 
		b = bond.bondRegex("(0(007)");
		assertTrue(b);
	}
	@Test
	public void testCase11() { 
		b = bond.bondRegex("(0(07)");
		assertFalse(b);
	}
	@Test
	public void testCase12() { 
		b = bond.bondRegex("(0(7)");
		assertFalse(b);
	}
	@Test
	public void testCase13() { 
		b = bond.bondRegex("(0)");
		assertFalse(b);
	}
	@Test
	public void testCase14() { 
		b = bond.bondRegex("(0))");
		assertFalse(b);
	}
	@Test
	public void testCase15() { 
		b = bond.bondRegex("(0)007)");
		assertTrue(b);
	}
	@Test
	public void testCase16() { 
		b = bond.bondRegex("(0)07)");
		assertFalse(b);
	}
	@Test
	public void testCase17() { 
		b = bond.bondRegex("(0)7)");
		assertFalse(b);
	}
	@Test
	public void testCase18() { 
		b = bond.bondRegex("(00()");
		assertFalse(b);
	}
	@Test
	public void testCase19() { 
		b = bond.bondRegex("(00(007)");
		assertTrue(b);
	}
	@Test
	public void testCase20() { 
		b = bond.bondRegex("(00(07)");
		assertFalse(b);
	}
	@Test
	public void testCase21() { 
		b = bond.bondRegex("(00(7)");
		assertFalse(b);
	}
	@Test
	public void testCase22() { 
		b = bond.bondRegex("(00)");
		assertFalse(b);
	}
	@Test
	public void testCase23() { 
		b = bond.bondRegex("(00))");
		assertFalse(b);
	}
	@Test
	public void testCase24() { 
		b = bond.bondRegex("(00)007)");
		assertTrue(b);
	}
	@Test
	public void testCase25() { 
		b = bond.bondRegex("(00)07)");
		assertFalse(b);
	}
	@Test
	public void testCase26() { 
		b = bond.bondRegex("(00)7)");
		assertFalse(b);
	}
	@Test
	public void testCase27() { 
		b = bond.bondRegex("(000)");
		assertFalse(b);
	}
	@Test
	public void testCase28() { 
		b = bond.bondRegex("(000007)");
		assertTrue(b);
	}
	@Test
	public void testCase29() { 
		b = bond.bondRegex("(00007)");
		assertTrue(b);
	}
	@Test
	public void testCase30() { 
		b = bond.bondRegex("(0007)");
		assertTrue(b);
	}
	@Test
	public void testCase31() { 
		b = bond.bondRegex("(001)");
		assertFalse(b);
	}
	@Test
	public void testCase32() { 
		b = bond.bondRegex("(001007)");
		assertTrue(b);
	}
	@Test
	public void testCase33() { 
		b = bond.bondRegex("(00107)");
		assertFalse(b);
	}
	@Test
	public void testCase34() { 
		b = bond.bondRegex("(0017)");
		assertFalse(b);
	}
	@Test
	public void testCase35() { 
		b = bond.bondRegex("(002)");
		assertFalse(b);
	}
	@Test
	public void testCase36() { 
		b = bond.bondRegex("(002007)");
		assertTrue(b);
	}
	@Test
	public void testCase37() { 
		b = bond.bondRegex("(00207)");
		assertFalse(b);
	}
	@Test
	public void testCase38() { 
		b = bond.bondRegex("(0027)");
		assertFalse(b);
	}
	@Test
	public void testCase39() { 
		b = bond.bondRegex("(003)");
		assertFalse(b);
	}
	@Test
	public void testCase40() { 
		b = bond.bondRegex("(003007)");
		assertTrue(b);
	}
	@Test
	public void testCase41() { 
		b = bond.bondRegex("(00307)");
		assertFalse(b);
	}
	@Test
	public void testCase42() { 
		b = bond.bondRegex("(0037)");
		assertFalse(b);
	}
	@Test
	public void testCase43() { 
		b = bond.bondRegex("(004)");
		assertFalse(b);
	}
	@Test
	public void testCase44() { 
		b = bond.bondRegex("(004007)");
		assertTrue(b);
	}
	@Test
	public void testCase45() { 
		b = bond.bondRegex("(00407)");
		assertFalse(b);
	}
	@Test
	public void testCase46() { 
		b = bond.bondRegex("(0047)");
		assertFalse(b);
	}
	@Test
	public void testCase47() { 
		b = bond.bondRegex("(005)");
		assertFalse(b);
	}
	@Test
	public void testCase48() { 
		b = bond.bondRegex("(005007)");
		assertTrue(b);
	}
	@Test
	public void testCase49() { 
		b = bond.bondRegex("(00507)");
		assertFalse(b);
	}
	@Test
	public void testCase50() { 
		b = bond.bondRegex("(0057)");
		assertFalse(b);
	}
	@Test
	public void testCase51() { 
		b = bond.bondRegex("(006)");
		assertFalse(b);
	}
	@Test
	public void testCase52() { 
		b = bond.bondRegex("(006007)");
		assertTrue(b);
	}
	@Test
	public void testCase53() { 
		b = bond.bondRegex("(00607)");
		assertFalse(b);
	}
	@Test
	public void testCase54() { 
		b = bond.bondRegex("(0067)");
		assertFalse(b);
	}
	@Test
	public void testCase55() { 
		b = bond.bondRegex("(007()");
		assertTrue(b);
	}
	@Test
	public void testCase56() { 
		b = bond.bondRegex("(007(007)");
		assertTrue(b);
	}
	@Test
	public void testCase57() { 
		b = bond.bondRegex("(007(07)");
		assertTrue(b);
	}
	@Test
	public void testCase58() { 
		b = bond.bondRegex("(007(7)");
		assertTrue(b);
	}
	@Test
	public void testCase59() { 
		b = bond.bondRegex("(007)");
		assertTrue(b);
	}
	@Test
	public void testCase60() { 
		b = bond.bondRegex("(007)()");
		assertTrue(b);
	}
	@Test
	public void testCase61() { 
		b = bond.bondRegex("(007)(007)");
		assertTrue(b);
	}
	@Test
	public void testCase62() { 
		b = bond.bondRegex("(007)(07)");
		assertTrue(b);
	}
	@Test
	public void testCase63() { 
		b = bond.bondRegex("(007)(7)");
		assertTrue(b);
	}
	@Test
	public void testCase64() { 
		b = bond.bondRegex("(007))");
		assertTrue(b);
	}
	@Test
	public void testCase65() { 
		b = bond.bondRegex("(007)))");
		assertTrue(b);
	}
	@Test
	public void testCase66() { 
		b = bond.bondRegex("(007))007)");
		assertTrue(b);
	}
	@Test
	public void testCase67() { 
		b = bond.bondRegex("(007))07)");
		assertTrue(b);
	}
	@Test
	public void testCase68() { 
		b = bond.bondRegex("(007))7)");
		assertTrue(b);
	}
	@Test
	public void testCase69() { 
		b = bond.bondRegex("(007)0)");
		assertTrue(b);
	}
	@Test
	public void testCase70() { 
		b = bond.bondRegex("(007)0007)");
		assertTrue(b);
	}
	@Test
	public void testCase71() { 
		b = bond.bondRegex("(007)007)");
		assertTrue(b);
	}
	@Test
	public void testCase72() { 
		b = bond.bondRegex("(007)07)");
		assertTrue(b);
	}
	@Test
	public void testCase73() { 
		b = bond.bondRegex("(007)1)");
		assertTrue(b);
	}
	@Test
	public void testCase74() { 
		b = bond.bondRegex("(007)1007)");
		assertTrue(b);
	}
	@Test
	public void testCase75() { 
		b = bond.bondRegex("(007)107)");
		assertTrue(b);
	}
	@Test
	public void testCase76() { 
		b = bond.bondRegex("(007)17)");
		assertTrue(b);
	}
	@Test
	public void testCase77() { 
		b = bond.bondRegex("(007)2)");
		assertTrue(b);
	}
	@Test
	public void testCase78() { 
		b = bond.bondRegex("(007)2007)");
		assertTrue(b);
	}
	@Test
	public void testCase79() { 
		b = bond.bondRegex("(007)207)");
		assertTrue(b);
	}
	@Test
	public void testCase80() { 
		b = bond.bondRegex("(007)27)");
		assertTrue(b);
	}
	@Test
	public void testCase81() { 
		b = bond.bondRegex("(007)3)");
		assertTrue(b);
	}
	@Test
	public void testCase82() { 
		b = bond.bondRegex("(007)3007)");
		assertTrue(b);
	}
	@Test
	public void testCase83() { 
		b = bond.bondRegex("(007)307)");
		assertTrue(b);
	}
	@Test
	public void testCase84() { 
		b = bond.bondRegex("(007)37)");
		assertTrue(b);
	}
	@Test
	public void testCase85() { 
		b = bond.bondRegex("(007)4)");
		assertTrue(b);
	}
	@Test
	public void testCase86() { 
		b = bond.bondRegex("(007)4007)");
		assertTrue(b);
	}
	@Test
	public void testCase87() { 
		b = bond.bondRegex("(007)407)");
		assertTrue(b);
	}
	@Test
	public void testCase88() { 
		b = bond.bondRegex("(007)47)");
		assertTrue(b);
	}
	@Test
	public void testCase89() { 
		b = bond.bondRegex("(007)5)");
		assertTrue(b);
	}
	@Test
	public void testCase90() { 
		b = bond.bondRegex("(007)5007)");
		assertTrue(b);
	}
	@Test
	public void testCase91() { 
		b = bond.bondRegex("(007)507)");
		assertTrue(b);
	}
	@Test
	public void testCase92() { 
		b = bond.bondRegex("(007)57)");
		assertTrue(b);
	}
	@Test
	public void testCase93() { 
		b = bond.bondRegex("(007)6)");
		assertTrue(b);
	}
	@Test
	public void testCase94() { 
		b = bond.bondRegex("(007)6007)");
		assertTrue(b);
	}
	@Test
	public void testCase95() { 
		b = bond.bondRegex("(007)607)");
		assertTrue(b);
	}
	@Test
	public void testCase96() { 
		b = bond.bondRegex("(007)67)");
		assertTrue(b);
	}
	@Test
	public void testCase97() { 
		b = bond.bondRegex("(007)7)");
		assertTrue(b);
	}
	@Test
	public void testCase98() { 
		b = bond.bondRegex("(007)7007)");
		assertTrue(b);
	}
	@Test
	public void testCase99() { 
		b = bond.bondRegex("(007)707)");
		assertTrue(b);
	}
	@Test
	public void testCase100() { 
		b = bond.bondRegex("(007)77)");
		assertTrue(b);
	}
	@Test
	public void testCase101() { 
		b = bond.bondRegex("(007)8)");
		assertTrue(b);
	}
	@Test
	public void testCase102() { 
		b = bond.bondRegex("(007)8007)");
		assertTrue(b);
	}
	@Test
	public void testCase103() { 
		b = bond.bondRegex("(007)807)");
		assertTrue(b);
	}
	@Test
	public void testCase104() { 
		b = bond.bondRegex("(007)87)");
		assertTrue(b);
	}
	@Test
	public void testCase105() { 
		b = bond.bondRegex("(007)9)");
		assertTrue(b);
	}
	@Test
	public void testCase106() { 
		b = bond.bondRegex("(007)9007)");
		assertTrue(b);
	}
	@Test
	public void testCase107() { 
		b = bond.bondRegex("(007)907)");
		assertTrue(b);
	}
	@Test
	public void testCase108() { 
		b = bond.bondRegex("(007)97)");
		assertTrue(b);
	}
	@Test
	public void testCase109() { 
		b = bond.bondRegex("(0070)");
		assertTrue(b);
	}
	@Test
	public void testCase110() { 
		b = bond.bondRegex("(0070007)");
		assertTrue(b);
	}
	@Test
	public void testCase111() { 
		b = bond.bondRegex("(007007)");
		assertTrue(b);
	}
	@Test
	public void testCase112() { 
		b = bond.bondRegex("(00707)");
		assertTrue(b);
	}
	@Test
	public void testCase113() { 
		b = bond.bondRegex("(0071)");
		assertTrue(b);
	}
	@Test
	public void testCase114() { 
		b = bond.bondRegex("(0071007)");
		assertTrue(b);
	}
	@Test
	public void testCase115() { 
		b = bond.bondRegex("(007107)");
		assertTrue(b);
	}
	@Test
	public void testCase116() { 
		b = bond.bondRegex("(00717)");
		assertTrue(b);
	}
	@Test
	public void testCase117() { 
		b = bond.bondRegex("(0072)");
		assertTrue(b);
	}
	@Test
	public void testCase118() { 
		b = bond.bondRegex("(0072007)");
		assertTrue(b);
	}
	@Test
	public void testCase119() { 
		b = bond.bondRegex("(007207)");
		assertTrue(b);
	}
	@Test
	public void testCase120() { 
		b = bond.bondRegex("(00727)");
		assertTrue(b);
	}
	@Test
	public void testCase121() { 
		b = bond.bondRegex("(0073)");
		assertTrue(b);
	}
	@Test
	public void testCase122() { 
		b = bond.bondRegex("(0073007)");
		assertTrue(b);
	}
	@Test
	public void testCase123() { 
		b = bond.bondRegex("(007307)");
		assertTrue(b);
	}
	@Test
	public void testCase124() { 
		b = bond.bondRegex("(00737)");
		assertTrue(b);
	}
	@Test
	public void testCase125() { 
		b = bond.bondRegex("(0074)");
		assertTrue(b);
	}
	@Test
	public void testCase126() { 
		b = bond.bondRegex("(0074007)");
		assertTrue(b);
	}
	@Test
	public void testCase127() { 
		b = bond.bondRegex("(007407)");
		assertTrue(b);
	}
	@Test
	public void testCase128() { 
		b = bond.bondRegex("(00747)");
		assertTrue(b);
	}
	@Test
	public void testCase129() { 
		b = bond.bondRegex("(0075)");
		assertTrue(b);
	}
	@Test
	public void testCase130() { 
		b = bond.bondRegex("(0075007)");
		assertTrue(b);
	}
	@Test
	public void testCase131() { 
		b = bond.bondRegex("(007507)");
		assertTrue(b);
	}
	@Test
	public void testCase132() { 
		b = bond.bondRegex("(00757)");
		assertTrue(b);
	}
	@Test
	public void testCase133() { 
		b = bond.bondRegex("(0076)");
		assertTrue(b);
	}
	@Test
	public void testCase134() { 
		b = bond.bondRegex("(0076007)");
		assertTrue(b);
	}
	@Test
	public void testCase135() { 
		b = bond.bondRegex("(007607)");
		assertTrue(b);
	}
	@Test
	public void testCase136() { 
		b = bond.bondRegex("(00767)");
		assertTrue(b);
	}
	@Test
	public void testCase137() { 
		b = bond.bondRegex("(0077)");
		assertTrue(b);
	}
	@Test
	public void testCase138() { 
		b = bond.bondRegex("(0077007)");
		assertTrue(b);
	}
	@Test
	public void testCase139() { 
		b = bond.bondRegex("(007707)");
		assertTrue(b);
	}
	@Test
	public void testCase140() { 
		b = bond.bondRegex("(00777)");
		assertTrue(b);
	}
	@Test
	public void testCase141() { 
		b = bond.bondRegex("(0078)");
		assertTrue(b);
	}
	@Test
	public void testCase142() { 
		b = bond.bondRegex("(0078007)");
		assertTrue(b);
	}
	@Test
	public void testCase143() { 
		b = bond.bondRegex("(007807)");
		assertTrue(b);
	}
	@Test
	public void testCase144() { 
		b = bond.bondRegex("(00787)");
		assertTrue(b);
	}
	@Test
	public void testCase145() { 
		b = bond.bondRegex("(0079)");
		assertTrue(b);
	}
	@Test
	public void testCase146() { 
		b = bond.bondRegex("(0079007)");
		assertTrue(b);
	}
	@Test
	public void testCase147() { 
		b = bond.bondRegex("(007907)");
		assertTrue(b);
	}
	@Test
	public void testCase148() { 
		b = bond.bondRegex("(00797)");
		assertTrue(b);
	}
	@Test
	public void testCase149() { 
		b = bond.bondRegex("(008)");
		assertFalse(b);
	}
	@Test
	public void testCase150() { 
		b = bond.bondRegex("(008007)");
		assertTrue(b);
	}
	@Test
	public void testCase151() { 
		b = bond.bondRegex("(00807)");
		assertFalse(b);
	}
	@Test
	public void testCase152() { 
		b = bond.bondRegex("(0087)");
		assertFalse(b);
	}
	@Test
	public void testCase153() { 
		b = bond.bondRegex("(009)");
		assertFalse(b);
	}
	@Test
	public void testCase154() { 
		b = bond.bondRegex("(009007)");
		assertTrue(b);
	}
	@Test
	public void testCase155() { 
		b = bond.bondRegex("(00907)");
		assertFalse(b);
	}
	@Test
	public void testCase156() { 
		b = bond.bondRegex("(0097)");
		assertFalse(b);
	}
	@Test
	public void testCase157() { 
		b = bond.bondRegex("(01)");
		assertFalse(b);
	}
	@Test
	public void testCase158() { 
		b = bond.bondRegex("(01007)");
		assertTrue(b);
	}
	@Test
	public void testCase159() { 
		b = bond.bondRegex("(0107)");
		assertFalse(b);
	}
	@Test
	public void testCase160() { 
		b = bond.bondRegex("(017)");
		assertFalse(b);
	}
	@Test
	public void testCase161() { 
		b = bond.bondRegex("(02)");
		assertFalse(b);
	}
	@Test
	public void testCase162() { 
		b = bond.bondRegex("(02007)");
		assertTrue(b);
	}
	@Test
	public void testCase163() { 
		b = bond.bondRegex("(0207)");
		assertFalse(b);
	}
	@Test
	public void testCase164() { 
		b = bond.bondRegex("(027)");
		assertFalse(b);
	}
	@Test
	public void testCase165() { 
		b = bond.bondRegex("(03)");
		assertFalse(b);
	}
	@Test
	public void testCase166() { 
		b = bond.bondRegex("(03007)");
		assertTrue(b);
	}
	@Test
	public void testCase167() { 
		b = bond.bondRegex("(0307)");
		assertFalse(b);
	}
	@Test
	public void testCase168() { 
		b = bond.bondRegex("(037)");
		assertFalse(b);
	}
	@Test
	public void testCase169() { 
		b = bond.bondRegex("(04)");
		assertFalse(b);
	}
	@Test
	public void testCase170() { 
		b = bond.bondRegex("(04007)");
		assertTrue(b);
	}
	@Test
	public void testCase171() { 
		b = bond.bondRegex("(0407)");
		assertFalse(b);
	}
	@Test
	public void testCase172() { 
		b = bond.bondRegex("(047)");
		assertFalse(b);
	}
	@Test
	public void testCase173() { 
		b = bond.bondRegex("(05)");
		assertFalse(b);
	}
	@Test
	public void testCase174() { 
		b = bond.bondRegex("(05007)");
		assertTrue(b);
	}
	@Test
	public void testCase175() { 
		b = bond.bondRegex("(0507)");
		assertFalse(b);
	}
	@Test
	public void testCase176() { 
		b = bond.bondRegex("(057)");
		assertFalse(b);
	}
	@Test
	public void testCase177() { 
		b = bond.bondRegex("(06)");
		assertFalse(b);
	}
	@Test
	public void testCase178() { 
		b = bond.bondRegex("(06007)");
		assertTrue(b);
	}
	@Test
	public void testCase179() { 
		b = bond.bondRegex("(0607)");
		assertFalse(b);
	}
	@Test
	public void testCase180() { 
		b = bond.bondRegex("(067)");
		assertFalse(b);
	}
	@Test
	public void testCase181() { 
		b = bond.bondRegex("(07)");
		assertFalse(b);
	}
	@Test
	public void testCase182() { 
		b = bond.bondRegex("(07007)");
		assertTrue(b);
	}
	@Test
	public void testCase183() { 
		b = bond.bondRegex("(0707)");
		assertFalse(b);
	}
	@Test
	public void testCase184() { 
		b = bond.bondRegex("(077)");
		assertFalse(b);
	}
	@Test
	public void testCase185() { 
		b = bond.bondRegex("(08)");
		assertFalse(b);
	}
	@Test
	public void testCase186() { 
		b = bond.bondRegex("(08007)");
		assertTrue(b);
	}
	@Test
	public void testCase187() { 
		b = bond.bondRegex("(0807)");
		assertFalse(b);
	}
	@Test
	public void testCase188() { 
		b = bond.bondRegex("(087)");
		assertFalse(b);
	}
	@Test
	public void testCase189() { 
		b = bond.bondRegex("(09)");
		assertFalse(b);
	}
	@Test
	public void testCase190() { 
		b = bond.bondRegex("(09007)");
		assertTrue(b);
	}
	@Test
	public void testCase191() { 
		b = bond.bondRegex("(0907)");
		assertFalse(b);
	}
	@Test
	public void testCase192() { 
		b = bond.bondRegex("(097)");
		assertFalse(b);
	}
	@Test
	public void testCase193() { 
		b = bond.bondRegex("(1)");
		assertFalse(b);
	}
	@Test
	public void testCase194() { 
		b = bond.bondRegex("(1007)");
		assertTrue(b);
	}
	@Test
	public void testCase195() { 
		b = bond.bondRegex("(107)");
		assertFalse(b);
	}
	@Test
	public void testCase196() { 
		b = bond.bondRegex("(17)");
		assertFalse(b);
	}
	@Test
	public void testCase197() { 
		b = bond.bondRegex("(2)");
		assertFalse(b);
	}
	@Test
	public void testCase198() { 
		b = bond.bondRegex("(2007)");
		assertTrue(b);
	}
	@Test
	public void testCase199() { 
		b = bond.bondRegex("(207)");
		assertFalse(b);
	}
	@Test
	public void testCase200() { 
		b = bond.bondRegex("(27)");
		assertFalse(b);
	}
	@Test
	public void testCase201() { 
		b = bond.bondRegex("(3)");
		assertFalse(b);
	}
	@Test
	public void testCase202() { 
		b = bond.bondRegex("(3007)");
		assertTrue(b);
	}
	@Test
	public void testCase203() { 
		b = bond.bondRegex("(307)");
		assertFalse(b);
	}
	@Test
	public void testCase204() { 
		b = bond.bondRegex("(37)");
		assertFalse(b);
	}
	@Test
	public void testCase205() { 
		b = bond.bondRegex("(4)");
		assertFalse(b);
	}
	@Test
	public void testCase206() { 
		b = bond.bondRegex("(4007)");
		assertTrue(b);
	}
	@Test
	public void testCase207() { 
		b = bond.bondRegex("(407)");
		assertFalse(b);
	}
	@Test
	public void testCase208() { 
		b = bond.bondRegex("(47)");
		assertFalse(b);
	}
	@Test
	public void testCase209() { 
		b = bond.bondRegex("(5)");
		assertFalse(b);
	}
	@Test
	public void testCase210() { 
		b = bond.bondRegex("(5007)");
		assertTrue(b);
	}
	@Test
	public void testCase211() { 
		b = bond.bondRegex("(507)");
		assertFalse(b);
	}
	@Test
	public void testCase212() { 
		b = bond.bondRegex("(57)");
		assertFalse(b);
	}
	@Test
	public void testCase213() { 
		b = bond.bondRegex("(6)");
		assertFalse(b);
	}
	@Test
	public void testCase214() { 
		b = bond.bondRegex("(6007)");
		assertTrue(b);
	}
	@Test
	public void testCase215() { 
		b = bond.bondRegex("(607)");
		assertFalse(b);
	}
	@Test
	public void testCase216() { 
		b = bond.bondRegex("(67)");
		assertFalse(b);
	}
	@Test
	public void testCase217() { 
		b = bond.bondRegex("(7)");
		assertFalse(b);
	}
	@Test
	public void testCase218() { 
		b = bond.bondRegex("(7007)");
		assertTrue(b);
	}
	@Test
	public void testCase219() { 
		b = bond.bondRegex("(707)");
		assertFalse(b);
	}
	@Test
	public void testCase220() { 
		b = bond.bondRegex("(77)");
		assertFalse(b);
	}
	@Test
	public void testCase221() { 
		b = bond.bondRegex("(8)");
		assertFalse(b);
	}
	@Test
	public void testCase222() { 
		b = bond.bondRegex("(8007)");
		assertTrue(b);
	}
	@Test
	public void testCase223() { 
		b = bond.bondRegex("(807)");
		assertFalse(b);
	}
	@Test
	public void testCase224() { 
		b = bond.bondRegex("(87)");
		assertFalse(b);
	}
	@Test
	public void testCase225() { 
		b = bond.bondRegex("(9)");
		assertFalse(b);
	}
	@Test
	public void testCase226() { 
		b = bond.bondRegex("(9007)");
		assertTrue(b);
	}
	@Test
	public void testCase227() { 
		b = bond.bondRegex("(907)");
		assertFalse(b);
	}
	@Test
	public void testCase228() { 
		b = bond.bondRegex("(97)");
		assertFalse(b);
	}
	@Test
	public void testCase229() { 
		b = bond.bondRegex(")");
		assertFalse(b);
	}
	@Test
	public void testCase230() { 
		b = bond.bondRegex("))");
		assertFalse(b);
	}
	@Test
	public void testCase231() { 
		b = bond.bondRegex(")007)");
		assertFalse(b);
	}
	@Test
	public void testCase232() { 
		b = bond.bondRegex(")07)");
		assertFalse(b);
	}
	@Test
	public void testCase233() { 
		b = bond.bondRegex(")7)");
		assertFalse(b);
	}
	@Test
	public void testCase234() { 
		b = bond.bondRegex("0)");
		assertFalse(b);
	}
	@Test
	public void testCase235() { 
		b = bond.bondRegex("0007)");
		assertFalse(b);
	}
	@Test
	public void testCase236() { 
		b = bond.bondRegex("007)");
		assertFalse(b);
	}
	@Test
	public void testCase237() { 
		b = bond.bondRegex("07)");
		assertFalse(b);
	}
	@Test
	public void testCase238() { 
		b = bond.bondRegex("1)");
		assertFalse(b);
	}
	@Test
	public void testCase239() { 
		b = bond.bondRegex("1007)");
		assertFalse(b);
	}
	@Test
	public void testCase240() { 
		b = bond.bondRegex("107)");
		assertFalse(b);
	}
	@Test
	public void testCase241() { 
		b = bond.bondRegex("17)");
		assertFalse(b);
	}
	@Test
	public void testCase242() { 
		b = bond.bondRegex("2)");
		assertFalse(b);
	}
	@Test
	public void testCase243() { 
		b = bond.bondRegex("2007)");
		assertFalse(b);
	}
	@Test
	public void testCase244() { 
		b = bond.bondRegex("207)");
		assertFalse(b);
	}
	@Test
	public void testCase245() { 
		b = bond.bondRegex("27)");
		assertFalse(b);
	}
	@Test
	public void testCase246() { 
		b = bond.bondRegex("3)");
		assertFalse(b);
	}
	@Test
	public void testCase247() { 
		b = bond.bondRegex("3007)");
		assertFalse(b);
	}
	@Test
	public void testCase248() { 
		b = bond.bondRegex("307)");
		assertFalse(b);
	}
	@Test
	public void testCase249() { 
		b = bond.bondRegex("37)");
		assertFalse(b);
	}
	@Test
	public void testCase250() { 
		b = bond.bondRegex("4)");
		assertFalse(b);
	}
	@Test
	public void testCase251() { 
		b = bond.bondRegex("4007)");
		assertFalse(b);
	}
	@Test
	public void testCase252() { 
		b = bond.bondRegex("407)");
		assertFalse(b);
	}
	@Test
	public void testCase253() { 
		b = bond.bondRegex("47)");
		assertFalse(b);
	}
	@Test
	public void testCase254() { 
		b = bond.bondRegex("5)");
		assertFalse(b);
	}
	@Test
	public void testCase255() { 
		b = bond.bondRegex("5007)");
		assertFalse(b);
	}
	@Test
	public void testCase256() { 
		b = bond.bondRegex("507)");
		assertFalse(b);
	}
	@Test
	public void testCase257() { 
		b = bond.bondRegex("57)");
		assertFalse(b);
	}
	@Test
	public void testCase258() { 
		b = bond.bondRegex("6)");
		assertFalse(b);
	}
	@Test
	public void testCase259() { 
		b = bond.bondRegex("6007)");
		assertFalse(b);
	}
	@Test
	public void testCase260() { 
		b = bond.bondRegex("607)");
		assertFalse(b);
	}
	@Test
	public void testCase261() { 
		b = bond.bondRegex("67)");
		assertFalse(b);
	}
	@Test
	public void testCase262() { 
		b = bond.bondRegex("7)");
		assertFalse(b);
	}
	@Test
	public void testCase263() { 
		b = bond.bondRegex("7007)");
		assertFalse(b);
	}
	@Test
	public void testCase264() { 
		b = bond.bondRegex("707)");
		assertFalse(b);
	}
	@Test
	public void testCase265() { 
		b = bond.bondRegex("77)");
		assertFalse(b);
	}
	@Test
	public void testCase266() { 
		b = bond.bondRegex("8)");
		assertFalse(b);
	}
	@Test
	public void testCase267() { 
		b = bond.bondRegex("8007)");
		assertFalse(b);
	}
	@Test
	public void testCase268() { 
		b = bond.bondRegex("807)");
		assertFalse(b);
	}
	@Test
	public void testCase269() { 
		b = bond.bondRegex("87)");
		assertFalse(b);
	}
	@Test
	public void testCase270() { 
		b = bond.bondRegex("9)");
		assertFalse(b);
	}
	@Test
	public void testCase271() { 
		b = bond.bondRegex("9007)");
		assertFalse(b);
	}
	@Test
	public void testCase272() { 
		b = bond.bondRegex("907)");
		assertFalse(b);
	}
	@Test
	public void testCase273() { 
		b = bond.bondRegex("97)");
		assertFalse(b);
	}

	
}

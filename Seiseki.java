
public class Seiseki {
	String course;
	String category;
	int credit;
	int grade;
}

class SeisekiTester{
	public static void main(String[] args) {
		Seiseki s = new Seiseki();
		s.grade = 3;
		s.category = "���Ȗ�";
		s.credit = 2;
		s.course = "�v���W�F�N�g����";
		System.out.println("�Ȗږ��F " + s.course);
		System.out.println("��ځF " + s.category);
		System.out.println("�P�ʁF " + s.credit);
		System.out.println("���сF " + s.grade);
		// TODO �����������ꂽ���\�b�h�E�X�^�u

	}

}

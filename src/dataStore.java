
import java.util.ArrayList;
import java.util.List;

public class dataStore {

	//�洢��Ƹ����
	public static List<jobModel> jobList = new ArrayList<>();
	//�洢�������г�����
	public static List<bycleModel> bycleList = new ArrayList<>();
	
	//��̬�����
	static {
		jobModel j1 = new jobModel("��ƹ滮ʦ��н3000",  8000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j2 = new jobModel("�������ҵز���Ƹ��Ӣ ��н3000 ", 3000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j3 = new jobModel("��ҵز���Ƹ����", 2000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j4 = new jobModel("��н��ǧ+����һ���н��Ƹ�绰����", 7000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j5 = new jobModel("Sharkman��н��Ƹ���۾�Ӣ ", 5000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j6 = new jobModel("���е绰����(Ů)Ů ", 2000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j7 = new jobModel("������ͨ���ó����������� ���� ", 6000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j8 = new jobModel("��Լʱ����װ��Ƹ��Ů����4000���� ", 10000, "�������ڱ�Ͷ�ʹ������޹�˾");
		jobModel j9 = new jobModel("�����˺ó�Ƹ����Ǯ�绰���۴�����",  20000, "�������ڱ�Ͷ�ʹ������޹�˾");
		
		jobList.add(j1);
		jobList.add(j2);
		jobList.add(j3);
		jobList.add(j4);
		jobList.add(j5);
		jobList.add(j6);
		jobList.add(j7);
		jobList.add(j8);
		jobList.add(j9);
		
		bycleModel b1 = new bycleModel("��Դ�綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b2 = new bycleModel("�ɸ�綯��", 130, "��ַ������������16���š����Է��ڸ���");
		bycleModel b3 = new bycleModel("���õ綯��", 350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b4 = new bycleModel("��õ綯��", 350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b5 = new bycleModel("С��綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b6 = new bycleModel("ë�ص綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b7 = new bycleModel("è��綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b8 = new bycleModel("�����綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b9 = new bycleModel("����綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		bycleModel b10 = new bycleModel("С��綯��", 1350, "��ַ������������16���š����Է��ڸ���");
		
		bycleList.add(b1);
		bycleList.add(b2);
		bycleList.add(b3);
		bycleList.add(b4);
		bycleList.add(b5);
		bycleList.add(b6);
		bycleList.add(b7);
		bycleList.add(b8);
		bycleList.add(b9);
		bycleList.add(b10);
		
		System.out.println("���ݽ���װ�أ�");
	}
	
	public dataStore() {
		
	
		
	}
	
	
}

import java.util.ArrayList;
import java.util.List;

public class StartGanJi {

	public static void main(String[] args) {
		dataStore ds = new dataStore();
		/*dataStore ds1 = new dataStore();
		dataStore ds2 = new dataStore();*/
		Pager<bycleModel> pb = browseByclePage(2);
		System.out.println(pb.getDatas());
	}
	
	public static Pager browseByclePage(Integer pageNum){
		Pager<bycleModel> byclePager = new Pager<>();
		List<bycleModel> bycleResult = new ArrayList<>();
		
		//ÿҳ��ʾ��������
		int count = 1;
		for(int i = (pageNum -1)*3 ; count <= byclePager.getItemNum(); i++){
			//�õ���Ӧ��Ԫ��
			bycleModel bModel = dataStore.bycleList.get(i);
			//���ݸ��м�����
			bycleResult.add(bModel);
			count ++;
		}
		
		byclePager.setDatas(bycleResult);
		return byclePager;
	}

}

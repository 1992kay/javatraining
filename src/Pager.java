import java.util.List;

public class Pager<T> {

	//����ĵڼ�ҳ
	private Integer pageNum;
	//�̶���ÿҳ��ʾ����
	private Integer itemNum;
	//�洢���صķ�ҳ����
	private List<T> datas;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getItemNum() {
		return itemNum;
	}
	public void setItemNum(Integer itemNum) {
		this.itemNum = itemNum;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public Pager() {
		//����ÿҳ��ʾ3������
		this.itemNum = 3;
	}
	
	
}

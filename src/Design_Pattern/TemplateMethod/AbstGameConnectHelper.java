package Design_Pattern.TemplateMethod;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	
	//���ø� �޼ҵ�
	public String requestConnection(String encodedInfo) {
		//���� �۾� > ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encodedInfo);
		//�������� : ��ȯ�Ȱ��� ������ ���̵� ��ȣ�� �Ҵ��Ѵ�.
		String id = "aaa";
		String password = "bbb";
		
		if(!authentication(id,password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		
		String userName = "";
		int i = authorization(userName);
		
		switch(i) {
		case 0://���ӸŴ���
			break;
		case 1://���� ȸ��
			break;
		case 2://���� ȸ��
			break;
		case 3://���Ѿ���
			break;
		default:
			break;
		}
		
		
		return connection(String info);
	}
}
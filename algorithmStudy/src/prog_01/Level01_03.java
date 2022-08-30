package prog_01;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//�Ű��� �ޱ�

public class Level01_03 {

	public static void main(String[] args) {
		
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
		
	}

	public static int[] solution(String[] id_list, String[] report, int k) {
	      
        Map<String,List<String>> map= new HashMap<>();
        Map<String,Integer> mail_map = new HashMap<>();
        // ��� ������ ���� �Ű��ڸ���Ʈ�� ����
        // Key: ����, Value: ������ �Ű��� �����
        for(String user: id_list){
            List<String> list = new LinkedList<>();
            map.put(user,list);         
            mail_map.put(user,0);    
        }      
        // �Ű���: attacker �Ű������ : defender
        // �Ű���� �Ǽ��� ó����       
        for(String temp: report){
            String[] arr=temp.split(" ");
            String attacker=arr[0];
            String defender=arr[1];           
            List<String> list =map.get(defender);
            //�ߺ��Ű� ����
            if(list.contains(attacker)){
                continue;
            }
            list.add(attacker);
            map.put(defender,list);        
        }                      
        // K�� �Ű���� ����� ã��, �Ű��� ����鿡�� Count����
        for(String data: map.keySet()){
            List<String> list =map.get(data);          
            if(list.size()>=k){                
                for(String user: list){
                    int count =mail_map.get(user)+1;
                    mail_map.put(user,count);          
                }
            }
        }
          int i=0;
          int[] answer = new int[id_list.length];
          for(String data: id_list){
              answer[i]= mail_map.get(data);
              i++;
          }        
        return answer;
    }
	
	
	
}

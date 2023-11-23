package sec01.verify.exam04;

public class Chatting { // 컴파일 에러 이유?
	// nickName은 final 특성이 있어서.
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;
		String nickName = chatId; // 가능하게 한 방법.
		
		class Chat {
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}

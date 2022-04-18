/* Define a class named Message that contains an instance variable of type String named text that stores any textual content for the Message. Create a method named toString that returns the text field and also include a method to set this value.  
Next, define a class for SMS that is derived from Message and includes instance variables for the recipientContactNo. Implement appropriate accessor and mutator methods. The body of the SMS message should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.  
Similarly, define a class for Email that is derived from Message and includes an instance variable for the sender, receiver, and subject. The textual contents of the file should be stored in the inherited variable text. Redefine the toString method to concatenate all text fields.  
Create sample objects of type Email and SMS in your main method. Test your objects bypassing them to the following subroutine that returns true if the object contains the specified keyword in the text property.
public static boolean ContainsKeyword(Message messageObject,                                                                  String keyword) {
        if (messageObject.toString().indexOf(keyword,0) >= 0)  
         return true;    
        return false; } 
 Finally, include a method to encode the final message “This is Java” using an encoding scheme, according to which, each character should be replaced by the character that comes after it. For example, if the message contains character B or b, it should be replaced by C or c accordingly, while Z or z should be replaced with an A or a.  If the final message is “This is Java”, then the encoded message should be “UijtjtKbwb”.

	Solution:
*/
class Message{
	String text;
	Message(String text){
		this.text = text;
	}
	void setText(String text){
		this.text = text;
	}
	public String toString(){
		return text;
	}
}
class SMS extends Message{
	String reciepentContactNo;
	SMS(String text){
		super(text);
	}
	void setReciepentContactNo(String reciepentContactNo){
		this.reciepentContactNo = reciepentContactNo;
	}
	String getreciepentContactNo(){
		return reciepentContactNo;
	}
	public String toString(){
		return "This is reciepentContactNo: "+getreciepentContactNo()+" and this is: "+super.toString();
	}
}
class Email extends Message{
	String sender;
	String reciever;
	String subject;
	Email(String sender, String reciever, String subject, String text){
		super(text);
		this.sender = sender;
		this.reciever = reciever;
		this.subject = subject;
	}
	public String toString(){
		return "Subject is: "+subject+"Sender is: "+sender+" Reciever is: "+reciever+"Message is: "+toString();
	}
}
class Solution{

	public static boolean ContainsKeyword(Message messageObject,String keyword){

        	if (messageObject.toString().indexOf(keyword,0) >= 0){  
         		return true;
		}
		else{   
        		return false;
		}
	} 
	
	public static String encode(String text){
		for(int i=0;i<text.length();i++){
			char a = text.charAt(i);
			if((a>='A'&&a<='Z')||(a>='a'&&a<='z')){
				if(a=='z'){
					a = 'a';
				}
				else if(a=='Z'){
					a='A';
				}
				else{
					a+=1;
				}
				if(i!=text.length()){
					text = text.substring(0,i)+a;
				}
				else{
					text = text.substring(0,i)+a;
				}
			}
		}
		return text.replace(" ","");
	}
	

	public static void main(String args[]){
		Message message = new Message("Hello, how are you?");
		SMS sms = new SMS("Hope, you're doing good.");
		//System.out.println(sms);
		sms.setReciepentContactNo("032456347");
		Email email = new Email("Parkash","Kelash","About health", "Hi");
		
		System.out.println(ContainsKeyword(message,"Hello"));
		
		String txt = encode("This is Java");
		email.setText(txt);
		System.out.println(txt);
	}
}

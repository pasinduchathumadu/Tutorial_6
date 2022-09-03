import scala.io.StdIn.readLine
object q1{
    def main(args: Array[String]): Unit = {
        val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val lowercase = "abcdefghijklmnopqrstuvwxyz"
        print("Enter the Plaintext:")
        val plaintext = readLine()
        val Encrypt = (c:Char,key:Int,a:String)=>a((a.indexOf(c)+key)%a.size)
        val Decrypt = (c:Char,key:Int,a:String)=>a((a.indexOf(c)-key)%a.size)
        print("Ciphertext:")
        var Encrypt_text=""
        for(i<- 0 until plaintext.size){
            if(plaintext.charAt(i)==plaintext.charAt(i).toUpper){
                val pt =Encrypt(plaintext.charAt(i),1,uppercase)
                Encrypt_text=Encrypt_text+pt.toString()
            }
            else{
                val pt =Encrypt(plaintext.charAt(i),1,lowercase)
                Encrypt_text=Encrypt_text+pt.toString()
            }
        }
        println(Encrypt_text)
        var Decrypt_text=""
        print("Decrypt:")
        for(i<-0 until Encrypt_text.size){
            if(Encrypt_text.charAt(i)==Encrypt_text.charAt(i).toUpper){
                val ct =Decrypt(Encrypt_text.charAt(i),1,uppercase)
                Decrypt_text=Decrypt_text+ct.toString()
            }
            else{
                val ct =Decrypt(Encrypt_text.charAt(i),1,lowercase)
                Decrypt_text=Decrypt_text+ct.toString()
            }
        }
        print(Decrypt_text)
    }
}
import helloworld.*
import org.nazt.lexto.*
import groovy.util.*
import java.*
import groovy.util.*
/*/	System.setProperty( "file.encoding", "UTF-8" );*/
class JavaController {
	
   // HelloWorld tt = new HelloWorld();
	def myTypeList,myIndexList=[]
	//cc.Test();
    def index = { 
	 System.out.println("Encoding: " + System.getProperty("file.encoding"));
     System.out.println("Charset: " + java.nio.charset.Charset.defaultCharset());
//	  LongLexTo tokenizer=new LongLexTo(new File("lexitron.txt"));
/*	  tokenizer.genOutput("‡∏õ‡∏£‡∏∞‡∏Å‡∏≤‡∏®‡πÅ‡∏à‡πâ‡∏á ‡∏Ç‡πà‡∏≤‡∏ß (‡πÄ‡∏™‡πâ‡∏ô‡∏ó‡∏≤‡∏á‡∏ó‡∏µ‡πà‡πÄ‡∏õ‡πá‡∏ô‡∏õ‡∏±‡∏ç‡∏´‡∏≤‡∏î‡πâ‡∏≤‡∏ô‡∏Å‡∏≤‡∏£‡∏à‡∏£‡∏≤‡∏à‡∏£‡πÉ‡∏ô‡∏ä‡πà‡∏ß‡∏á‡πÄ‡∏ß‡∏•‡∏≤‡∏ô‡∏µ‡πâ) ‡∏ñ‡∏ô‡∏ô‡∏û‡∏£‡∏∞‡∏£‡∏≤‡∏°6 ‡∏ä‡πà‡∏ß‡∏á‡∏û‡∏á‡∏©‡πå‡∏û‡∏£‡∏∞‡∏£‡∏≤‡∏° ‡∏°‡∏∏‡πà‡∏á‡∏´‡∏ô‡πâ‡∏≤‡∏≠‡∏∏‡∏£‡∏∏‡∏û‡∏á‡∏©‡πå ‡∏õ‡∏£‡∏¥‡∏°‡∏≤‡∏ì‡∏£‡∏ñ‡∏°‡∏≤‡∏Å‡πÄ‡∏Ñ‡∏•‡∏∑‡πà‡∏≠‡∏ô‡∏ï‡∏±‡∏ß‡πÑ‡∏î‡πâ‡∏ä‡πâ‡∏≤ , ‡∏ñ‡∏ô‡∏ô‡∏•‡∏≤‡∏î‡∏û‡∏£‡πâ‡∏≤‡∏ß ‡∏ä‡πà‡∏ß‡∏á‡∏£‡∏±‡∏ä‡∏î‡∏≤‡∏•‡∏≤‡∏î‡∏û‡∏£‡πâ‡∏≤‡∏ß ‡∏°‡∏∏‡πà‡∏á‡∏´‡∏ô‡πâ‡∏≤‡πÇ‡∏ä‡∏Ñ‡∏ä‡∏±‡∏¢4 ‡∏õ‡∏£‡∏¥‡∏°‡∏≤‡∏ì‡∏£‡∏ñ‡∏°‡∏≤‡∏Å‡πÄ‡∏Ñ‡∏•‡∏∑‡πà‡∏≠‡∏ô‡∏ï‡∏±‡∏ß‡πÑ‡∏î‡πâ‡∏ä‡πâ‡∏≤ , ‡πÅ‡∏à‡πâ‡∏á‡πÉ‡∏´‡πâ‡∏ó‡∏£‡∏≤‡∏ö‡πÑ‡∏ß‡πâ‡πÄ‡∏õ‡πá‡∏ô‡∏Ç‡πâ‡∏≠‡∏°‡∏π‡∏• ‡∏ß‡∏±‡∏ô‡∏ó‡∏µ‡πà07/09/2009 17:54:46","nat2.html");*/
	def myString=[]
	def lexdict=new File("lexitron.txt")
	LongLexTo tokenizer=new LongLexTo()
	println "lexsize="+lexdict.size()
 	def news=new File("news.txt").getText("MacRoman")
println news.trim()
//	tokenizer.genOutput(news.trim(),"net434.html");
//	news.eachLine{
//		tokenizer.genOutput(it,"net3.html");
		tokenizer.wordInstance(news.trim())
		myTypeList = tokenizer.getTypeList()
		myIndexList=tokenizer.getIndexList()
		myString = [news]
	
	println System.getProperty("user.dir");
	def indexer=0
	myIndexList.eachWithIndex{ num, idx ->
		def type=myTypeList[idx]
		render  myString[0][indexer..num-1] + "|" 
		indexer=num
	}
	
/*	println myIndexList
	println myTypeList*/
//	println 
	render "TEST"
//	Charset guessedCharset = CharsetToolkit.guessEncoding("ทดสอบ", 4096);

	 System.out.println("Encoding: " + System.getProperty("file.encoding"));
    System.out.println("Charset: " + java.nio.charset.Charset.defaultCharset());
/*		println "lexsize="+lexdict.size()*/
	 } 
}

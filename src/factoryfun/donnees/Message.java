package factoryfun.donnees;

public class Message
{

	private String msg;
	private String commentaire;

	public Message(String msg)
	{
		this.msg = msg;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}
	
	public String getCommentaire()
	{
		return commentaire;
	}
	
	public void setCommentaire(String commentaire)
	{
		this.commentaire = commentaire;
	}
	
}
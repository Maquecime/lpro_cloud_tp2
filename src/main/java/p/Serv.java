package p;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



import static com.googlecode.objectify.ObjectifyService.ofy;

@Path("/employes")
public class Serv {
		
	public Serv() {

	}

	 @GET
	 @Produces("text/html")	
	public String getEmployees() {	
		 	List<Employees> e = ofy().load().type(Employees.class).list();
			String response = "<html><head><meta charset = 'utf8'/></head><ul>";
			for(int i = 0; i < e.size(); i++) {
				response += "<li>"+e.get(i).getName()+"</li>";
			}
			response+="</html>";
			return response;
	}
	 
	 
	 @POST
	 @Consumes("application/json")
	 public void addEmployee(Employees e) {
		 ofy().save().entity(e);
	 }
	
 }

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program_Dates {

	public static void main(String[] args) throws ParseException {
		
		//formato das datas com SimpleDateFormat
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				SimpleDateFormat sdfWithTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				SimpleDateFormat sdfWithTimeGreenwich = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				sdfWithTimeGreenwich.setTimeZone(TimeZone.getTimeZone("GMT"));

				
		//data pre definida
				Date y1 = sdf.parse("27/10/2021");
				Date y2 = sdfWithTime.parse("27/10/2021 12:43:35");
		
		//data presente
				Date x1 = new Date();
				Date x2 = new Date(System.currentTimeMillis());
				
		//data pre definida usando milissegundos
				Date a1 = new Date(1000L + 60L + 60L + 5L);

				
		//data pre definida Padrão ISO 8601 classe Instant
				Date b1 = Date.from(Instant.parse("2018-06-25T15:42:08Z"));
				
				
		//resultados:
		System.out.println("____________________");   //as que foram setadas sem horário aparecem com horário zero
				System.out.println(y1);
				System.out.println(y2);
				System.out.println(x1);
				System.out.println(x2);
				System.out.println(a1);
				System.out.println(b1);
				
		System.out.println("\n_____Datas formatadas_____");  //as que foram setadas com horário estão no formato 2
				System.out.println(sdf.format(y1));
				System.out.println(sdfWithTime.format(y2));
				System.out.println(sdf.format(x1));
				System.out.println(sdfWithTime.format(x2));
				System.out.println(sdfWithTime.format(a1));
				System.out.println(sdfWithTime.format(b1));
				
		System.out.println("\n_____Datas formatadas no horário standard de Greenwich____"); //sem descontar as 3 horas do Brasil
				System.out.println(sdfWithTimeGreenwich.format(y1));
				System.out.println(sdfWithTimeGreenwich.format(y2));
				System.out.println(sdfWithTimeGreenwich.format(x1));
				System.out.println(sdfWithTimeGreenwich.format(y2));
				System.out.println(sdfWithTimeGreenwich.format(a1));
				System.out.println(sdfWithTimeGreenwich.format(b1));
	}

}

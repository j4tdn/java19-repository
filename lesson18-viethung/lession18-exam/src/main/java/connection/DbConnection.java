package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {

	// static đảm bảo trong ứng dụng chỉ tạo ra 1 session duy nhất
	private static SessionFactory sessionFactory = null;
	private static String DATASOURCE_PATH = "hibernate.cfg.xml";

	public DbConnection() {
	}

	// synchronized là đồng bộ hóa, đảm abor tại 1 thời điểm chỉ có thể
	// có thể gọi hàm theo 1 luồng duy nhất, đảm bảo chỉ tồn tại 1 đối tượng
	// session được tạo ra
	public static synchronized SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(DATASOURCE_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}

}

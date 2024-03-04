package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;

import persistence.entities.ItemGroup;

public class HibernateCacheDao extends BaseHibernateDao implements CacheDao {

	@Override
	public void firstLevelCache() {
		// 1st level cache
		// configure : có sẵn của hibernate
		// disable : không được
		// scope : single transaction - single session

		Session s1 = openSession();
		Session s2 = openSession();

		ItemGroup group = s1.get(ItemGroup.class, 1);
	}

	@Override
	public void secondLevelCache() {
		System.out.println(" Start : Test 2st level cache");

		Session s1 = openSession();
		Session s2 = openSession();
		Session s3 = openSession();

		ItemGroup group1 = s1.get(ItemGroup.class, 1); // get from db
		System.out.println("group 1 " + group1);

		ItemGroup group2 = s2.get(ItemGroup.class, 2); // get from db
		System.out.println("group 2 " + group2);

		ItemGroup group3 = s1.get(ItemGroup.class, 2); // get from cache
		System.out.println("group 3 " + group3);

		ItemGroup group4 = s2.get(ItemGroup.class, 2); // get from cache
		System.out.println("group 4 " + group4);

		doTask(5);

		ItemGroup group5 = s3.get(ItemGroup.class, 1); // get from cache
		System.out.println("group 5 " + group5);

		System.out.println("Finish : Test 1st level cache");
	}

	private static void doTask(int second) {
		while (second > 0) {
			try {
				System.out.println(second-- + " (s)");
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

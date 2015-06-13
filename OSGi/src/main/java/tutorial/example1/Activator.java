package tutorial.example1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceEvent;

public class Activator implements BundleActivator, ServiceListener
{
	public void start(BundleContext context)
	{
		System.out.println("Starting to listen for service events.");
		context.addServiceListener(this);
	}

	public void stop(BundleContext context)
	{
		context.removeServiceListener(this);
		System.out.println("Stopped listening for service events.");
	}

	public void serviceChanged(ServiceEvent event)
	{
		String[] objectClass = (String[])event.getServiceReference().
			getProperty("objectClass");

		if (event.getType() == ServiceEvent.REGISTERED)
		{
			System.out.println("Ex1: Service of type "
				+ objectClass[0]
				+ " registered.");
		}

		if (event.getType() == ServiceEvent.UNREGISTERING)
		{
			System.out.println("Ex2: Service of type "
				+ objectClass[0]
				+ " unregistered.");
		}

		if (event.getType() == ServiceEvent.MODIFIED)
		{
			System.out.println("Ex3: Serivce of type "
				+ objectClass[0]
				+ " modified.");
		}
	}
}

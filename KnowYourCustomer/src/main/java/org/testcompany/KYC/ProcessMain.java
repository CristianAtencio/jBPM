package org.testcompany.KYC;

import java.util.List;


public class ProcessMain {

	public static void main(String[] args) {
//		KieServices ks = KieServices.Factory.get();
//		KieContainer kContainer = ks.getKieClasspathContainer();
//		KieBase kbase = kContainer.getKieBase("kbase");
//
//		RuntimeManager manager = createRuntimeManager(kbase);
//		RuntimeEngine engine = manager.getRuntimeEngine(null);
//		KieSession ksession = engine.getKieSession();
//		TaskService taskService = engine.getTaskService();
//
//		ksession.startProcess("com.sample.bpmn.hello");
//
//		// let john execute Task 1
//		List<TaskSummary> list = taskService.getTasksAssignedAsPotentialOwner("john", "en-UK");
//		TaskSummary task = list.get(0);
//		System.out.println("John is executing task " + task.getName());
//		taskService.start(task.getId(), "john");
//		taskService.complete(task.getId(), "john", null);
//
//		// let mary execute Task 2
//		list = taskService.getTasksAssignedAsPotentialOwner("mary", "en-UK");
//		task = list.get(0);
//		System.out.println("Mary is executing task " + task.getName());
//		taskService.start(task.getId(), "mary");
//		taskService.complete(task.getId(), "mary", null);
//
//		manager.disposeRuntimeEngine(engine);
//		System.exit(0);
	}

//	private static RuntimeManager createRuntimeManager(KieBase kbase) {
//		JBPMHelper.startH2Server();
//		JBPMHelper.setupDataSource();
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("org.jbpm.persistence.jpa");
//		RuntimeEnvironmentBuilder builder = RuntimeEnvironmentBuilder.Factory.get()
//			.newDefaultBuilder().entityManagerFactory(emf)
//			.knowledgeBase(kbase);
//		return RuntimeManagerFactory.Factory.get()
//			.newSingletonRuntimeManager(builder.get(), "com.sample:example:1.0");
//	}

}
package biblioteca;

public abstract class DomainObject {

		private long id;
		
		public DomainObject(long id) {
			super();
			this.id = id;
		}

		public long getId() {
			return id;
		}

		/*
		public void setId(long id) {
			this.id = id;
		}
		*/
		
}

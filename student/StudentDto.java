
public class StudentDto {
	
		private int id;
		private String name;
		private int physics;
		private int chemistry;
		private int maths;

		public StudentDto(int id,String name,int physics,int chemistry,int maths)
		{
			this.id=id;
			this.name=name;
			this.physics=physics;
			this.chemistry=chemistry;
			this.maths=maths;
		}
		
		
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id=id;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name=name;
		}
		public int getphysics() {
			return physics;
		}
		public void setphysics(int physics) {
			this.physics=physics;
		}
		public int chemistry() {
			return chemistry;
		}
		public void setchemistry(int chemistry) {
			this.chemistry=chemistry;
		}
		public int getmaths() {
			return maths;
		}
		public void setmaths(int maths) {
			this.maths=maths;
		}

		
}

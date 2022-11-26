package pl.sdacademy.java.patterns;

import java.util.Set;

class Teacher implements HasPerson {

   private Person person;
   private static Set<String> subjectCodes;
   private String subject;

   public Teacher(String subject) {
      this.subject = subject;
   }

   public static TeacherBuilder builder() {
      return new TeacherBuilder()
              .subject("MAT")
              .subject("ENG")
              .subject("BIO");
   }

   public Teacher(Person person, Set<String> subjectCodes, String subject) {
      this.person = person;
      this.subjectCodes = subjectCodes;
   }

   @Override
   public Person getPerson() {
      return person;
   }

   public Set<String> getSubjectCodes() {
      return subjectCodes;
   }
}

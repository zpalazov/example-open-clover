package open.clover.compilestatic.issue

import spock.lang.Specification

class PersonTest extends Specification {
    def "application has a greeting"() {
        given:
        Person person = new Person()
        PersonService service = new PersonService()

        when:
        service.display(person)

        then:
        null == person.name
    }
}

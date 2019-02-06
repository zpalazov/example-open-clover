package open.clover.compilestatic.issue

import groovy.transform.CompileStatic
import org.apache.commons.io.FilenameUtils

@CompileStatic
class PersonService {

    void display(Person person) {
        String ext = FilenameUtils.getExtension(person?.file)?.toLowerCase()
    }
}

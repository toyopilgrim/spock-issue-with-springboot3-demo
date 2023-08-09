package demo

import com.example.demo.DemoInitializingBean
import com.example.demo.DemoService
import com.example.demo.DemoPostConstruct
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest(classes = [DemoPostConstruct, DemoInitializingBean])
class DemoServiceSpec extends Specification {

  def "demo post construct"() {
    when:
    def res = new DemoService().demoPostConstruct()

    then:
    res == "OK"
  }

  def "demo initializing bean"() {
    when:
    def res = new DemoService().demoInitializingBean()

    then:
    res == "OK"
  }
}

mport java.util.List;

import org.mvc.model.Doctor;
import org.springframework.jdbc.core.JdbcTemplate;

public class DoctorDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Doctor doctor) {
        String sql = "insert into doctor (name,email,specialist, city,country) " + "values ('" + doctor.getName()
                + "','" + doctor.getEmail() + "','" + doctor.getSpecialist() + "','" + doctor.getCity() + "','"
                + doctor.getCountry() + "') ";
        return jdbcTemplate.update(sql);
    }

    public int update(Doctor doctor) {
        String sql = "update doctor set name = '" + doctor.getName() + "', email = '" + doctor.getEmail()
                + "', specialist = '" + doctor.getSpecialist() + "', city = '" + doctor.getCity() + "', country='"
                + doctor.getCountry() + "' where id = '"+doctor.getId()+"' ";
        return jdbcTemplate.update(sql);
    }

    public int delete(int id) {
        String sql = "delete from doctor where id = '" + id + "'";
        return jdbcTemplate.update(sql);
    }

    public Doctor getDoctorById(int id) {
        String sql = "select * from doctor where id = '" + id + "'";
        return jdbcTemplate.queryForObject(sql, new org.mvc.dao.RowMapperImpl());
    }

    public List<Doctor> getListOfDoctors() {
        String sql = "select * from doctor";
        return jdbcTemplate.query(sql, new org.mvc.dao.RowMapperImpl());
    }
}

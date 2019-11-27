package backend.service;

import backend.pojo.ClubMember;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: OY
 * @date: 16:04 2019/11/27
 */
@Service
public interface ClubMemberService {
    public void addClubMember(ClubMember clubMember);

    public void deleteClubMemberById(String id);

    public int updateClubMember(ClubMember clubMember);

    public Optional<ClubMember> queryClubMemberById(String id);

    public List<ClubMember> queryAllClubMember();
}

// This class was generated on Mon, 09 Apr 2018 16:10:52 UTC by version 0.1.0-dev+291f3f of Braintree SDK Generator
// DisputeRequireEvidenceRequest.java
// @version 0.1.0-dev+291f3f
// @type request
// @data H4sIAAAAAAAC/+RW32/jNgx+319BaHtoASfuht3tlresTddgXZsl6Q1DUdSKzcRabckT6faMov/7IMnO5UdxvWHdXu7RNEV+H/mR0qO4kCWKgcgUVTVj3+JftbLYw3uVoU5RROIEKbWqYmW0GIirKpOMBJwjEEtGMEuQ0J6PYNHA+CQCNoCKc7SQ/D4cz8cXP9+eXk5vf7r6YzS9nY5mk8uL2SgBs/N/Njo/33TowzxX1CZKc6lXCKjlokDq4jsgi7pB64IRFoWzGaB6USqGjgcsTXDtiMJ46b8TmTpmCSiCJMAbvR+fjC6OR0kUPHz2BOqOufkkp3XkENjHjVpe/zDyXjVEJH6r0TYTaWWJjJbE4PomEmcoM7S71lNjy13bRHK+ZXsU86ZyCiC2Sq9EJN5Lq1yFt5VxqzIRiV+wac17wpjnCOMTp4aNMgPnkqEVFa274YgMrZVNyH0UiSnK7FIXjRgsZUHoDP5MJgZsa4zExJoKLSskMdB1UTzdBB8kDkHWRNqTMOpa37rtU1uYrNki1Rq2iQ09fiR2/Qmt+gLVv9PX/24YPjPRc7Px2ZJqDZuaenkQAoUtvaxN+6PQEmYDqSmrAhn/LcKg+ifnRZXRhDu6n9ULckLVDEOfnPY5fHqENyIE+PR6VT1X+g420+1hK5S+oy2AnWVnHjVIB8kppZ3MnsVCMmZwfTacjy6HM/BHbw7izKQUy0rFuWQ0knr+R3y4Q+zt68slt7jcYtMa9qXSCQRY2hUyXE3P+zA3UMq7sGk6dqksisi5L5QOf0rk3GTwoDgHdrvi+mo6hjmWlTvRWxpbSmbMbg5y5ooGcczGFNRXyMu+sas457KI7TJ9++aHo0NftT6cGguVxV5lTYpESq8iUDot6iwkTb5JIkgOkgikziA5TNxusjJ1N4pbWQiJ4+qXivO/wwa6vjiuRjuF+ZvBdwPkugSBY+Aj3Rbr9OjMrzJA0YuNCzXdat3atN+8s/l80rWhvecyN/XPNu9/YmCx2IIfvvexX7vyB4B+VzUVviiUNz++e/c1oV8Pve8PI3jIVZoDob1HAkkgtXsGuAtH+vaGRtdalgu1qk1NRQOZh7LonpFYSs0qpW73BxnOEOHar41pi5A+ont4eOgrqaXHJonUSpeomWJ3ttdR2v3sf3A0Dl9pE7tdfGw0o26fIEJWVaFSnyv+k/ySO2Oufg3yGYjJ5WwuwiNMDER8/22c1sSmRBu39x3Fjx8fXE/xM8/x2Z2q1qhGHypMGbMZS67p2GQoBt8dHT199TcAAAD//w==
// DO NOT EDIT
package com.paypal.sdk.v1.customerdisputes;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Updates the state of a dispute, by ID, to either `WAITING_FOR_BUYER_RESPONSE` or `WAITING_FOR_SELLER_RESPONSE`. This state change enables either the buyer or seller to submit evidence for the dispute. If the `action` is `BUYER_EVIDENCE`, the `state` updates to `WAITING_FOR_BUYER_RESPONSE`. If the action is `,SELLER_EVIDENCE`, the `state` updates to `WAITING_FOR_SELLER_RESPONSE`.
 */
public class DisputeRequireEvidenceRequest extends HttpRequest<SubsequentActions> {

    public DisputeRequireEvidenceRequest(String disputeId) {
        super("/v1/customer/disputes/{dispute_id}/require-evidence?", "POST", SubsequentActions.class);
        try {
            path(path().replace("{dispute_id}", URLEncoder.encode(String.valueOf(disputeId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    

    public DisputeRequireEvidenceRequest requestBody(RequireEvidenceRequest body) {
        super.requestBody(body);
        return this;
    }
}

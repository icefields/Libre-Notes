package luci.sixsixsix.homemessageshare.domain.use_case

import luci.sixsixsix.homemessageshare.domain.MessagesRepository
import javax.inject.Inject

class DeleteMessageUseCase @Inject constructor(
    private val messagesRepository: MessagesRepository
) {
    suspend operator fun invoke(username: String, id: String) =
        messagesRepository.deleteMessage(username, id)
}

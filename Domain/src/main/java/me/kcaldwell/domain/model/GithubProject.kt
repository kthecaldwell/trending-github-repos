package me.kcaldwell.domain.model

class GithubProject(val id: String, val name: String, val fullName: String,
                    val starCount: String, val dateCreated: String,
                    val ownerName: String, val ownerAvatar: String,
                    val isBookmarked: Boolean)
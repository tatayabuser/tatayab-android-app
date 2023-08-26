package com.tatayab.tatayab.main.concierge

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.tatayab.tatayab.R

public class ConciergeFragmentDirections private constructor() {
  public companion object {
    public fun actionDestinationConciergeToHome(): NavDirections =
        ActionOnlyNavDirections(R.id.action_destination_concierge_to_home)
  }
}

package io.github.jackbeback.klib.UI.searchbar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.jackbeback.klib.UI.badge.PillBadge
import io.github.jackbeback.klib.UI.badge.smallAppPillBadgeDefaults
import io.github.jackbeback.klib.UI.text.DefaultText
import io.github.jackbeback.klib.UI.textfield.OutlinedTextField
import io.github.jackbeback.klib.Utility.log
import io.github.jackbeback.klib.theme.icons.dazzleline.DazzleLine
import io.github.jackbeback.klib.theme.icons.dazzleline.FilterList
import kotlinx.coroutines.delay

@Composable
fun <T> SearchBar(
    modifier: Modifier = Modifier,
    onSearch: suspend (query: String) -> List<T>,
    maxResults: Int = 5,
    listItem: @Composable (entity: T) -> Unit = { entity ->
        ResultListItem(
            text = entity.toString()
        )
    }
) {
    var query by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    var searchResults by remember { mutableStateOf(listOf<T>()) }
    var badges by remember { mutableStateOf(listOf<String>()) }
    var isLoading by remember { mutableStateOf(false) }

    LaunchedEffect(query) {
        try {
            isLoading = true
            searchResults = onSearch(query)
        } finally {
            isLoading = false
        }
    }

    Column(
        modifier = modifier.fillMaxSize().scrollable(rememberScrollState(), Orientation.Vertical),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = query,
            onValueChange = { value ->
                query = value
            },
            trailingIcon = DazzleLine.FilterList,
            trailingIconOnClick = {
                badges = badges.toMutableList().apply { add(query) }
                query = ""
            },
            leadingIcon = null,
            singleLine = true,
            modifier = modifier,
            errorText = "Error",
            isError = isError,
            enabled = true,
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp, vertical = 4.dp),
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            badges.forEach {
                PillBadge(
                    text = it,
                    defaults = smallAppPillBadgeDefaults(),
                    backgroundColor = MaterialTheme.colorScheme.primary
                )
            }
        }
        if (isLoading) {
            CircularProgressIndicator()
        }else if (searchResults.isEmpty()) {
            DefaultText(text = "No results", Modifier)
        } else {
            searchResults.take(maxResults).forEach {
                listItem(it)
            }
        }
    }
}

@Composable
fun ResultListItem(text: String, badge: String? = null, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxWidth()
            .padding(vertical = 1.dp, horizontal = 10.dp)
            .background(color = MaterialTheme.colorScheme.background)
            .clip(RoundedCornerShape(5.dp))
            .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(5.dp))
    ) {
        DefaultText(text = text, modifier = Modifier.align(Alignment.Center).clickable {})
        if (badge != null) {
            PillBadge(modifier = Modifier.align(Alignment.CenterEnd).padding(end = 5.dp), text = badge)
        }
    }
}

@Composable
fun SearchBarSample() {
    SearchBar(onSearch = { query ->
        countries.filter { it.toString().contains(query, ignoreCase = true) }
    }, maxResults = 20) { country ->
        ResultListItem(text = country.toString(), modifier = Modifier.clickable {
            log.i(country.toString())
        })
    }
}


data class Country(val name: String, val capital: String)

val countries = listOf(
    Country("United States", "Washington, D.C."),
    Country("Canada", "Ottawa"),
    Country("United Kingdom", "London"),
    Country("Germany", "Berlin"),
    Country("France", "Paris"),
    Country("Japan", "Tokyo"),
    Country("Australia", "Canberra"),
    Country("India", "New Delhi"),
    Country("Russia", "Moscow"),
    Country("Brazil", "Brasília"),
    Country("South Africa", "Pretoria"),
    Country("China", "Beijing"),
    Country("Mexico", "Mexico City"),
    Country("Italy", "Rome"),
    Country("Spain", "Madrid"),
    Country("South Korea", "Seoul"),
    Country("Argentina", "Buenos Aires"),
    Country("Saudi Arabia", "Riyadh"),
    Country("Netherlands", "Amsterdam"),
    Country("Turkey", "Ankara"),
    Country("Switzerland", "Bern"),
    Country("Sweden", "Stockholm"),
    Country("Norway", "Oslo"),
    Country("Denmark", "Copenhagen"),
    Country("Finland", "Helsinki"),
    Country("Poland", "Warsaw"),
    Country("Greece", "Athens"),
    Country("Portugal", "Lisbon"),
    Country("New Zealand", "Wellington"),
    Country("Chile", "Santiago"),
    Country("Thailand", "Bangkok"),
    Country("Indonesia", "Jakarta"),
    Country("Malaysia", "Kuala Lumpur"),
    Country("Singapore", "Singapore"),
    Country("Philippines", "Manila"),
    Country("Vietnam", "Hanoi"),
    Country("Egypt", "Cairo"),
    Country("Nigeria", "Abuja"),
    Country("Kenya", "Nairobi"),
    Country("Ghana", "Accra"),
    Country("Ethiopia", "Addis Ababa"),
    Country("Colombia", "Bogotá"),
    Country("Peru", "Lima"),
    Country("Venezuela", "Caracas"),
    Country("Cuba", "Havana"),
    Country("Pakistan", "Islamabad"),
    Country("Bangladesh", "Dhaka"),
    Country("Sri Lanka", "Colombo"),
    Country("Nepal", "Kathmandu"),
    Country("Iraq", "Baghdad"),
    Country("Afghanistan", "Kabul"),
    Country("Israel", "Jerusalem"),
    Country("Jordan", "Amman"),
    Country("Qatar", "Doha"),
    Country("United Arab Emirates", "Abu Dhabi"),
    Country("Kuwait", "Kuwait City"),
    Country("Oman", "Muscat"),
    Country("Iran", "Tehran"),
    Country("Morocco", "Rabat"),
    Country("Senegal", "Dakar"),
    Country("Tanzania", "Dodoma"),
    Country("Uganda", "Kampala"),
    Country("Zambia", "Lusaka"),
    Country("Zimbabwe", "Harare"),
    Country("Angola", "Luanda"),
    Country("Algeria", "Algiers"),
    Country("Mozambique", "Maputo"),
    Country("Ivory Coast", "Yamoussoukro"),
    Country("Madagascar", "Antananarivo"),
    Country("Botswana", "Gaborone"),
    Country("Namibia", "Windhoek"),
    Country("Lesotho", "Maseru"),
    Country("Eswatini", "Mbabane"),
    Country("Malawi", "Lilongwe"),
    Country("Togo", "Lomé"),
    Country("Burkina Faso", "Ouagadougou"),
    Country("Cameroon", "Yaoundé"),
    Country("Gabon", "Libreville"),
    Country("Congo", "Brazzaville"),
    Country("Chad", "N'Djamena"),
    Country("Sudan", "Khartoum"),
    Country("South Sudan", "Juba"),
    Country("Somalia", "Mogadishu"),
    Country("Libya", "Tripoli"),
    Country("Tunisia", "Tunis"),
    Country("Afghanistan", "Kabul"),
    Country("Myanmar", "Naypyidaw"),
    Country("Laos", "Vientiane"),
    Country("Brunei", "Bandar Seri Begawan"),
    Country("East Timor", "Dili"),
    Country("Mongolia", "Ulaanbaatar"),
    Country("Bhutan", "Thimphu"),
    Country("Maldives", "Malé"),
    Country("Georgia", "Tbilisi"),
    Country("Armenia", "Yerevan"),
    Country("Azerbaijan", "Baku"),
    Country("Kazakhstan", "Astana"),
    Country("Uzbekistan", "Tashkent"),
    Country("Turkmenistan", "Ashgabat"),
    Country("Kyrgyzstan", "Bishkek"),
    Country("Tajikistan", "Dushanbe"),
    Country("Belarus", "Minsk"),
    Country("Ukraine", "Kyiv"),
    Country("Estonia", "Tallinn")
)
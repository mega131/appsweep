class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("HELLO WORLD")
        setContent {
            AppsweepYoutubeDemoTheme {
            }
        }
    }
}